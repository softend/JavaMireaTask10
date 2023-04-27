package ru.zenchenko.task10;

import org.springframework.stereotype.Component;

@Component
public class InsertionSort implements SortingAlgorythm{
    public void doSort() {
        System.out.println("Doing InsertionSort!");
    }
}
