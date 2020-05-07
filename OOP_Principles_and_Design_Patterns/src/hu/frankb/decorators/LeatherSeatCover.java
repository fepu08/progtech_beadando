package hu.frankb.decorators;

public class LeatherSeatCover implements SeatCover {
    //This is what we will decorate
    private Buyable buyable; //e.g. Car

    private static String name = "Bőr";
    private static double price = 15000;

    @Override
    public String getDescription() {
        return buyable.getDescription() + " Üléshuzat: " + name;
    }

    @Override
    public double getPrice() {
        return buyable.getPrice() +  price;
    }
}
