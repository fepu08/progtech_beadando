package hu.frankb;

public class Car extends Buyable implements Comparable<Car>{
    private int id;
    private String type;

    public int getId(){return id;}
    public void setId(int id){this.id = id;}

    public Car(int id, String name, String type, double price){
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
    }

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

    @Override
    public String description() {
        return this.toString();
    }

    //TODO override toString()
    @Override
    public String toString() {
        return ("ID: " + id + " Name: " + name + " Type: " + type + " Price: " + price + "Ft");
    }
}
