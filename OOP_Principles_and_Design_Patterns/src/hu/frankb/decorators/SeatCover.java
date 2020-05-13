package hu.frankb.decorators;

public abstract class SeatCover implements Buyable{
    //This is what we will decorate
    private Buyable buyable;
    private String name;
    private double price;

    public SeatCover(String name, double price, Buyable buyable){
        this.name = name;
        this.price = price;
        this.buyable = buyable;
    }

    // decorator method
    @Override
    public String getDescription() {
        return buyable.getDescription() + ", Üléshuzat : " + name;
    }

    // decorator method
    @Override
    public double getPrice() {
        return buyable.getPrice() + price;
    }
}
