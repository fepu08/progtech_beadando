package hu.frankb.decorators;

public class LeatherSeatCover extends SeatCover {
    private static String name = "Bőr";
    private static double price = 15000;

    public LeatherSeatCover(Buyable buyable) {
        super(name, price, buyable);
    }
}
