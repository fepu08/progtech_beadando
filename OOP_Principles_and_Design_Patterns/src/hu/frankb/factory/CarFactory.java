package hu.frankb.factory;

import hu.frankb.decorators.Buyable;

public interface CarFactory {
    Buyable createRimDecorator(Buyable buyable);
    Buyable createSeatCoverDecorator(Buyable buyable);
}
