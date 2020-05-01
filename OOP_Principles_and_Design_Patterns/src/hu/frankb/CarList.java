package hu.frankb;

import hu.frankb.strategy.sorting.CarSortingStrategy;
import hu.frankb.strategy.sorting.SortByIdASC;

import java.util.ArrayList;
import java.util.List;

public class CarList{
    List<Car> cars;
    CarSortingStrategy carSortingStrategy; // Aggregáció - HAS-A kapcsolat - GOF1

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
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


    public boolean addCar(Car newCar){
        if(addCarPreCondition(newCar)){
            cars.add(newCar);
            return true;
        } else {
            return false;
        }
    }

    private boolean addCarPreCondition(Car newCar) {
        for(int i = 0; i < cars.size(); i++){
            if (cars.get(i).getId() == newCar.getId()){
                return false;
            }
        }
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

    public CarList(){
        cars = new ArrayList<>();
        carSortingStrategy = new SortByIdASC();
    }
    public CarList(List<Car> cars, CarSortingStrategy carSortingStrategy) {
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