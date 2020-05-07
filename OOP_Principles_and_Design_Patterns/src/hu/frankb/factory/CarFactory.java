package hu.frankb.factory;

import hu.frankb.Buyable;

public interface CarFactory {
    Buyable createCar();
    Buyable createRimDecorator();
    Buyable createSeatDecorator();
}
