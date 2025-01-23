package org.designpatterns.behavioural.strategy;

import java.util.ArrayList;
import java.util.List;

public class StrategyPatternMain {
    public static void main(String[] args) {
        SortingContext sortingContext = new SortingContext(new BubbleSortStrategy());
        List<Integer> numbers = new ArrayList<>();
        numbers.add(9);
        numbers.add(1);
        numbers.add(54);
        numbers.add(2);
        System.out.println(sortingContext.sortNumbers(numbers));
        sortingContext.setSortingStrategy(new QuickSortStrategy());
        System.out.println(sortingContext.sortNumbers(numbers));
    }
}
