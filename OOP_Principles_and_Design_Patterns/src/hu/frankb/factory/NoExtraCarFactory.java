package hu.frankb.factory;

import hu.frankb.decorators.Buyable;

public class NoExtraCarFactory implements CarFactory {
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
