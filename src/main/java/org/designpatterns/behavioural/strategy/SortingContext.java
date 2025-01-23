package org.designpatterns.behavioural.strategy;

import java.util.List;

public class SortingContext {
    private SortingStrategy sortingStrategy;

    public SortingContext(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void setSortingStrategy(SortingStrategy sortingStrategy){
        this.sortingStrategy = sortingStrategy;
    }

    public List<Integer> sortNumbers(List<Integer> numbers){
        return sortingStrategy.sort(numbers);
    }
}
