package hu.frankb.strategy.sorting;

import hu.frankb.CarStoreListElement;

import java.util.Collections;
import java.util.List;

public class SortByIdDESC implements CarSortingStrategy {
    @Override
    public void sort(List<CarStoreListElement> input) {
        Collections.sort(input, Collections.reverseOrder());
    }
}
