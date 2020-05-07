package hu.frankb.strategy.sorting;

import hu.frankb.Car;

import java.util.List;

public interface CarSortingStrategy {
    void sort(List<Car> input);
}
