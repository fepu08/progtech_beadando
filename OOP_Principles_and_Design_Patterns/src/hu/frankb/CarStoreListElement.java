package hu.frankb;

import hu.frankb.decorators.Buyable;
import hu.frankb.exceptions.InvalidIndexException;

public class CarStoreListElement implements Comparable<CarStoreListElement>{
    private int id;
    private Buyable buyable;
    //maybe add a time stamp ...

    public CarStoreListElement(Buyable buyable){
        this.buyable = buyable;
    }

    public CarStoreListElement(int id, Buyable buyable){
        this(buyable);
        this.id = id;
    }

    public int getId(){return id;}
    public void setId(int id) throws InvalidIndexException {
        if(id < 0) throw new InvalidIndexException("Az id nem lehet negatív");
        this.id = id;
    }
    public Buyable getBuyable(){return buyable;}
    public void setBuyable(Buyable buyable){this. buyable = buyable;}

    //needed for sorting strategy
    @Override
    public int compareTo(CarStoreListElement anotherListElement) {
        if(this.getId() < anotherListElement.getId()) {
            return -1; // this is less than another
        } else if (this.getId() > anotherListElement.getId()){
            return 1; // this is greater than another
        } else {
            return 0; // they are equals
        }
    }

    @Override
    public String toString() {
        return "ID: " + id + " " + buyable.getDescription() + ", Össz.Ár: " + this.buyable.getPrice();
    }
}
