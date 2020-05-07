package hu.frankb.factory;

import hu.frankb.Buyable;

public class FullExtraCarFactory implements CarFactory {
    @Override
    public Buyable createCar() {
        return null;
    }

    @Override
    public Buyable createRimDecorator() {
        return null;
    }

    @Override
    public Buyable createSeatDecorator() {
        return null;
    }
}
