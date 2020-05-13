package hu.frankb.decorators;

public class AluminiumRim extends Rim {
    private static String name = "Aluminium";
    private static double price = 100000;

    public AluminiumRim(Buyable buyable) {
        super(name, price, buyable);
    }
}
