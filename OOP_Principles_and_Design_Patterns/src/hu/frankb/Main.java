package hu.frankb;

import hu.frankb.decorators.Car;
import hu.frankb.strategy.sorting.SortByIdASC;
import hu.frankb.strategy.sorting.SortByIdDESC;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    CarStore cars = new CarStore(populate(), new SortByIdASC());

        Car car = new Car(1, "Francis", "Bacon 123", 1110123);
        System.out.println("Try Car toString");
        System.out.println(car + "\n");

        System.out.println("Try CarList toString");
        System.out.println(cars + "\n");

        cars.setCarSortingStrategy(new SortByIdDESC());
        cars.sort();
        System.out.println("Changed the CarList Sorting Strategy to SortIdByDESC");
        System.out.println(cars + "\n");

    }

    private static ArrayList<Car> populate(){
        ArrayList<Car> carList = new ArrayList<>();
        Car car1 = new Car(1, "Francis", "Bacon 123", 1110123);
        Car car2 = new Car(2, "Napoleon", "Bonaparte 1800", 9870654);
        Car car3 = new Car(3, "Francis", "Bacon 333", 11234567);
        Car car4 = new Car(4, "Napoleon", "Bonaparte 1800", 20369654);
        Car car5 = new Car(5, "Francis", "Bacon 416", 30405060);
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);

        return carList;
    }
}
