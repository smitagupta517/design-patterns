package org.designpatterns.behavioural.strategy;

import java.util.List;

public interface SortingStrategy {
    List<Integer> sort(List<Integer> numbers);
}
