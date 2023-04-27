package ru.zenchenko.task10;

import org.springframework.stereotype.Component;

@Component // Создаем бин
public class QuickSort implements SortingAlgorythm{
    public void doSort() {
        System.out.println("Doing QuickSort!");
    }
}
