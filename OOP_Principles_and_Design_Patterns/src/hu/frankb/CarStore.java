package hu.frankb;

import hu.frankb.decorators.Buyable;
import hu.frankb.factory.CarFactory;
import hu.frankb.factory.FullExtraCarFactory;
import hu.frankb.factory.NoExtraCarFactory;
import hu.frankb.strategy.sorting.CarSortingStrategy;
import hu.frankb.strategy.sorting.SortByIdASC;

import java.util.ArrayList;
import java.util.List;

public class CarStore {
    List<CarStoreListElement> cars;
    CarSortingStrategy carSortingStrategy; // Aggregáció - HAS-A kapcsolat - GOF1

    public List<CarStoreListElement> getCars() {
        return cars;
    }

    public void setCars(List<CarStoreListElement> cars) {
        this.cars = cars;
    }

    public CarSortingStrategy getCarSortingStrategy() {
        return carSortingStrategy;
    }

    // lehetőséget nyújtunk lekérni és beállítani, hogy milyen CarSortingStrategy-t használunk
    public void setCarSortingStrategy(CarSortingStrategy carSortingStrategy) {
        this.carSortingStrategy = carSortingStrategy;
    }

    //Az osztály sort metódusa használja a CarSortingStrategy sort metódusát
    public void sort() {
        carSortingStrategy.sort(cars);
    }


    public boolean addCar(Buyable newCar){
        CarStoreListElement newElement = new CarStoreListElement(this.getNextId(), newCar);
        cars.add(newElement);

        return true;
    }

    public boolean removeCarById(int id){
        for(int i = 0; i < cars.size(); i++){
            if(cars.get(i).getId() == id){
                cars.remove(i);
                return true;
            }
        }
        return false;
    }

    // part of AbstractFactory
    private Buyable createCar(CarFactory carFactory){
        //From the carFactory it get of parameter, it decides which CarFactroy to use
        //create the basic car
        Buyable car = new Car();

        //LET'S DECORATE \,,\,
        // add the decorators
        car = carFactory.createRimDecorator(car);
        car = carFactory.createSeatCoverDecorator(car);

        return car;
    }

    private int getNextId() {
        if(cars.isEmpty()){
            return 1;
        } else {
            // if cars is not empty, return the last members id + 1;
            int IdOfLastElement = (cars.get(cars.size() - 1).getId());
            return IdOfLastElement + 1;
        }
    }

    // part of AbstractFactory
    public void createNoExtraCar(){
           Buyable newCar = createCar(new NoExtraCarFactory());
           this.addCar(newCar);
    }

    // part of AbstractFactory
    public void createFullExtraCar(){
        Buyable newCar =  createCar(new FullExtraCarFactory());
        this.addCar(newCar);
    }

    public CarStore(){
        cars = new ArrayList<>();
        carSortingStrategy = new SortByIdASC();
    }
    public CarStore(List<CarStoreListElement> cars, CarSortingStrategy carSortingStrategy) {
        this.cars = cars;
        this.carSortingStrategy = carSortingStrategy;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < cars.size()-1; i++){
            sb.append(cars.get(i).toString() + "\n");
        }

        sb.append(cars.get(cars.size() - 1).toString());
        return sb.toString();
    }
}