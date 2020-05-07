package hu.frankb;

import hu.frankb.decorators.Buyable;

// this class is part of all of the patterns included
public class Car implements Buyable, Comparable<Car>{
    private int id;
    private String name = "Bömbi";
    private String type = "MX22";
    private double price = 10000000;

    public int getId(){return id;}
    public void setId(int id){this.id = id;}
    public String getName(){return name;};
    public void setName(String name){this.name = name;}
    public void setPrice(double price){this.price = price;}

    //public Car(){};

    public Car(int id){
        this.id = id;
    }

    //Decorator method
    @Override
    public String getDescription() {
        return this.toString();
    }

    //Decorator method
    @Override
    public double getPrice() {
        return price;
    }

    //needed for sorting strategy
    @Override
    public int compareTo(Car anotherCar) {
        if(this.getId() < anotherCar.getId()) {
            return -1; // this is less than another
        } else if (this.getId() > anotherCar.getId()){
            return 1; // this is greater than another
        } else {
            return 0; // they are equals
        }
    }

    //TODO override toString()
    @Override
    public String toString() {
        return ("ID: " + id + " Name: " + name + " Type: " + type + " Price: " + price + "Ft");
    }
}
