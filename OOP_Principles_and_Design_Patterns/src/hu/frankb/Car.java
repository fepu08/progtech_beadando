package hu.frankb;

import hu.frankb.decorators.Buyable;
import hu.frankb.exceptions.InvalidIndexException;
import hu.frankb.exceptions.InvalidPriceException;
import hu.frankb.exceptions.InvalidStringException;

// this class is part of all of the patterns included
public class Car implements Buyable{
    private String name = "Bömbi";
    private String type = "MX22";
    private double price = 1000000;

    public String getName(){return name;};
    public void setName(String name) throws InvalidStringException {
        if (name == "") throw new InvalidStringException("A név nem lehet üres string!");
        this.name = name;
    }
    public void setPrice(double price) throws InvalidPriceException {
        if(price < 0) throw new InvalidPriceException("Nem lehet negatív az összeg");
        this.price = price;
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

    //TODO override toString()
    @Override
    public String toString() {
        return ("Name: " + name + ", Type: " + type + ", Base Price: " + price + "Ft");
    }
}
