package org.designpatterns.behavioural.strategy;

import java.util.Collections;
import java.util.List;

public class BubbleSortStrategy implements SortingStrategy {
    @Override
    public List<Integer> sort(List<Integer> numbers) {
        System.out.println("Sorting array via bubble sort");
        boolean isSwapped;
        for(int i = 0; i < numbers.size() - 1; i++){
            isSwapped = false;
            for(int j = 0; j < numbers.size() - i - 1; j++){
                if(numbers.get(j) > numbers.get(j + 1)){
                    Collections.swap(numbers, i, j);
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                break;
            }
        }
        return numbers;
    }
}
