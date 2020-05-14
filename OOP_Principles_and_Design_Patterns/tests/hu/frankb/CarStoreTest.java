package hu.frankb;

import hu.frankb.decorators.Buyable;
import hu.frankb.exceptions.InvalidIndexException;
import hu.frankb.exceptions.InvalidStringException;
import hu.frankb.strategy.sorting.CarSortingStrategy;
import hu.frankb.strategy.sorting.SortByIdASC;
import hu.frankb.strategy.sorting.SortByIdDESC;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class CarStoreTest {
    private CarStore carStore;

    @org.junit.Test
    public void getCars() {
        carStore = new CarStore();
        carStore.createNoExtraCar();
        carStore.createFullExtraCar();

        ArrayList<CarStoreListElement> cars = new ArrayList<>();
        for (int i = 0; i <  carStore.getCars().size(); i++){
            cars.add(carStore.getCars().get(i));
        }

        assertEquals(cars, carStore.getCars());
    }

    @org.junit.Test
    public void setCars() {
    }

    @org.junit.Test
    public void getCarSortingStrategy() {
    }

    @org.junit.Test
    public void setCarSortingStrategy() {
        carStore = new CarStore();
        CarSortingStrategy mySortStrat = new SortByIdDESC();
        carStore.setCarSortingStrategy(mySortStrat);
        assertEquals(mySortStrat,carStore.getCarSortingStrategy());
    }

    @org.junit.Test
    public void sort() {
    }

    @org.junit.Test
    public void addCar() throws InvalidIndexException, InvalidStringException {
        carStore = new CarStore();
        carStore.createNoExtraCar();
        carStore.createNoExtraCar();
        carStore.createFullExtraCar();

        Car myCar = new Car();
        myCar.setName("Test");
        carStore.addCar(myCar);

        int lastInex = carStore.getCars().size() - 1;
        assertEquals("Test", ((Car)carStore.getCars().get(lastInex).getBuyable()).getName());
    }

    @org.junit.Test
    public void removeCarById() {

    }

    @org.junit.Test
    public void createNoExtraCar() {
        carStore = new CarStore();
        carStore.createNoExtraCar();
        assertEquals("ID: 1 Name: Bömbi, Type: MX22, Base Price: 1000000.0Ft, Felni : Lemezfelni, Üléshuzat : Műszállas, Össz.Ár: 1045000.0",
                carStore.getCars().get(0).toString());
    }

    @org.junit.Test
    public void createFullExtraCar() {
        carStore = new CarStore();
        carStore.createFullExtraCar();
        assertEquals("ID: 1 Name: Bömbi, Type: MX22, Base Price: 1000000.0Ft, Felni : Aluminium, Üléshuzat : Bőr, Össz.Ár: 1115000.0",
                carStore.getCars().get(0).toString());
    }

    @org.junit.Test
    public void testToString() {
    }
}