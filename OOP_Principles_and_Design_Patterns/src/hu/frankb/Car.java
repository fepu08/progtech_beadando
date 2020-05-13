package hu.frankb;

import hu.frankb.decorators.Buyable;

// this class is part of all of the patterns included
public class Car implements Buyable{
    private String name = "Bömbi";
    private String type = "MX22";
    private double price = 10000000;

    public String getName(){return name;};
    public void setName(String name){this.name = name;}
    public void setPrice(double price){this.price = price;}

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

    //TODO override toString()
    @Override
    public String toString() {
        return ("Name: " + name + " Type: " + type + " Price: " + price + "Ft");
    }
}
