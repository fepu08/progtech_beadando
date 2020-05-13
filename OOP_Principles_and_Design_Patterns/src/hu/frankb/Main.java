package hu.frankb;

import hu.frankb.strategy.sorting.SortByIdDESC;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
	    CarStore cars = populate();

        Car car = new Car();
        System.out.println("Try Car toString");
        System.out.println(car + "\n");

        System.out.println("Try CarList toString");
        System.out.println(cars + "\n");

        cars.setCarSortingStrategy(new SortByIdDESC());
        cars.sort();
        System.out.println("Changed the CarList Sorting Strategy to SortIdByDESC");
        System.out.println(cars + "\n");
    }

    private static CarStore populate(){
        CarStore returnStore = new CarStore();
        Random rnd = new Random();
        for(int i = 0; i < 10; i++){
            if(rnd.nextInt(2) == 0){
                returnStore.createNoExtraCar();
            } else {
                returnStore.createFullExtraCar();
            }
        }


        return returnStore;
    }
}
