package hu.frankb.decorators;

public class SteelRim implements Rim {
    //This is what we will decorate
    private Buyable buyable; //e.g. Car

    private static String name = "Lemezfelni";
    private static double price = 40000;

    @Override
    public String getDescription() {
        return buyable.getDescription() + " Felni: " + name;
    }

    @Override
    public double getPrice() {
        return buyable.getPrice() +  price;
    }
}
