package ru.zenchenko.task10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    SortingAlgorythm algorythm;

    @Autowired
    public Computer(@Qualifier("insertionSort") SortingAlgorythm algorythm) {
        this.algorythm = algorythm;
    }
}
