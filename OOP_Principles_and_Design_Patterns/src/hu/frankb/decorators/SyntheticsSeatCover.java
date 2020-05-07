package hu.frankb.decorators;

public class SyntheticsSeatCover extends SeatCover {
    private static String name = "Műszállas";
    private static double price = 5000;

    public SyntheticsSeatCover(Buyable buyable) {
        super(buyable);
    }
}
