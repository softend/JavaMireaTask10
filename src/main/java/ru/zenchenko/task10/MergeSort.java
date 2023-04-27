package ru.zenchenko.task10;

import org.springframework.stereotype.Component;

@Component
public class MergeSort implements SortingAlgorythm{
    public void doSort() {
        System.out.println("Doing MergeSort!");
    }
}
