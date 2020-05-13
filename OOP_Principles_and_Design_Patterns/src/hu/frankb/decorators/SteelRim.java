package hu.frankb.decorators;

public class SteelRim extends Rim {
    private static String name = "Lemezfelni";
    private static double price = 40000;

    public SteelRim(Buyable buyable) {
        super(name, price, buyable);
    }
}
