package hu.frankb.factory;

import hu.frankb.decorators.AluminiumRim;
import hu.frankb.decorators.Buyable;
import hu.frankb.decorators.LeatherSeatCover;

public class FullExtraCarFactory implements CarFactory {
    @Override
    public Buyable createRimDecorator(Buyable buyable) { return new AluminiumRim(buyable); }

    @Override
    public Buyable createSeatCoverDecorator(Buyable buyable) {
        return new LeatherSeatCover(buyable);
    }
}
