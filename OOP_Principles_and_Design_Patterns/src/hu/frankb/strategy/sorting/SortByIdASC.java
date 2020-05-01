package hu.frankb.strategy.sorting;

import hu.frankb.Car;

import java.util.Collections;
import java.util.List;

public class SortByIdASC implements CarSortingStrategy {
    @Override
    public void sort(List<Car> input) {
        Collections.sort(input);
    }
}
