package hu.frankb.decorators;

public abstract class Rim implements Buyable {
    private Buyable buyable;
    private String name;
    private double price;

    public Rim(Buyable buyable){
        this.buyable = buyable;
    }

    // decorator method
    @Override
    public String getDescription() {
        return buyable.getDescription() + " Felni : " + name;
    }

    // decorator method
    @Override
    public double getPrice() {
        return buyable.getPrice() + price;
    }
}
