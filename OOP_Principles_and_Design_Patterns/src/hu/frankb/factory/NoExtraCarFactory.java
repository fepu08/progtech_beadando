package hu.frankb.factory;

import hu.frankb.decorators.Buyable;
import hu.frankb.decorators.SteelRim;
import hu.frankb.decorators.SyntheticsSeatCover;

public class NoExtraCarFactory implements CarFactory {
    @Override
    public Buyable createRimDecorator(Buyable buyable) {
        return new SteelRim(buyable);
    }

    @Override
    public Buyable createSeatCoverDecorator(Buyable buyable) {
        return new SyntheticsSeatCover(buyable);
    }
}
