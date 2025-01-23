package org.designpatterns.behavioural.strategy;

import java.util.Collections;
import java.util.List;

public class QuickSortStrategy implements SortingStrategy {
    @Override
    public List<Integer> sort(List<Integer> numbers) {
        System.out.println("Sorting array via quick sort");
        quickSort(numbers, 0, numbers.size() - 1);
        return numbers;
    }

    private void quickSort(List<Integer> numbers, int low, int high){
        if(low < high){
            int pivot = pivotIndex(numbers, low, high);
            quickSort(numbers, low, pivot - 1);
            quickSort(numbers, pivot + 1, high);
        }
    }

    private int pivotIndex(List<Integer> numbers, int low, int high){
        int pivot = numbers.get(high);
        int i = low - 1;
        for(int j = low; j < high; j++){
            if(numbers.get(j) < pivot){
                Collections.swap(numbers, ++i, j);
            }
        }
        Collections.swap(numbers, i + 1, high);
        return i + 1;
    }
}
