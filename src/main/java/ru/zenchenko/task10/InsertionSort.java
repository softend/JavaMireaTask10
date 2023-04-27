package ru.zenchenko.task10;

import org.springframework.stereotype.Component;

@Component // Создаем бин
public class InsertionSort implements SortingAlgorythm{
    public void doSort() {
        System.out.println("Doing InsertionSort!");
    }
}
