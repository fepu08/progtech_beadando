package hu.frankb.factory;

import hu.frankb.decorators.Buyable;

public interface CarFactory {
    Buyable createCar();
    Buyable createRimDecorator();
    Buyable createSeatDecorator();
}
