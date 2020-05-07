package hu.frankb.decorators;

public class SyntheticsSeatCover implements SeatCover {
    //This is what we will decorate
    private Buyable buyable; //e.g. Car

    private static String name = "Műszállas";
    private static double price = 5000;

    @Override
    public String getDescription() {
        return buyable.getDescription() + " Üléshuzat: " + name;
    }

    @Override
    public double getPrice() {
        return buyable.getPrice() +  price;
    }
}
