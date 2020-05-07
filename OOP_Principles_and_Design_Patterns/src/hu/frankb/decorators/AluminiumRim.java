package hu.frankb.decorators;

public class AluminiumRim extends Rim {
    private static String name = "Műszállas";
    private static double price = 100000;

    public AluminiumRim(Buyable buyable) {
        super(buyable);
    }
}
