package hu.frankb.decorators;

public class Car implements Buyable, Comparable<Car>{
    private int id;
    private String name;
    private String type;
    private double price;

    public int getId(){return id;}
    public void setId(int id){this.id = id;}
    public String getName(){return name;};
    public void setName(String name){this.name = name;}
    //TODO: ez így jó lesz?
    public void setPrice(double price){this.price = price;}

    public Car(int id, String name, String type, double price){
        this.id = id;
        this.name = name;
        this.type = type;
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
