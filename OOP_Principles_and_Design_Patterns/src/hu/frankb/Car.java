package hu.frankb;

public class Car implements Comparable<Car>{
    private int id;

    public int getId(){return id;}
    public void setId(int id){this.id = id;}


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
}
