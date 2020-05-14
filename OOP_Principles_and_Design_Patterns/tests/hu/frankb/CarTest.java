package hu.frankb;

import hu.frankb.exceptions.InvalidPriceException;
import hu.frankb.exceptions.InvalidStringException;
import org.junit.Test;
import org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarTest {

    @Test
    public void setName() throws InvalidStringException {
        String name = "";
        assertThrows(InvalidStringException.class, () -> {
            Car car = new Car();
            car.setName(name);
        });

    }

    @Test
    public void setPrice() throws InvalidPriceException {
        double price = -123.00;
        assertThrows(InvalidPriceException.class, () -> {
            Car car = new Car();
            car.setPrice(price);
        });
    }
}