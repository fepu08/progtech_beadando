package hu.frankb.strategy.sorting;

import hu.frankb.CarStoreListElement;

import java.util.List;

public interface CarSortingStrategy {
    void sort(List<CarStoreListElement> input);
}
