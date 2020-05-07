package hu.frankb.decorators;

public class AluminiumRim implements Rim {
    //This is what we will decorate
    private Buyable buyable; //e.g. Car

    private static String name = "Műszállas";
    private static double price = 100000;

    @Override
    public String getDescription() {
        return buyable.getDescription() + " Felni: " + name;
    }

    @Override
    public double getPrice() {
        return buyable.getPrice() +  price;
    }
}
