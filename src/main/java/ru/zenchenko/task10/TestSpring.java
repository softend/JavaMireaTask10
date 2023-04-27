package ru.zenchenko.task10;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        //Берем бин
        SortingAlgorythm algorythm = context.getBean(args[0], SortingAlgorythm.class);

        algorythm.doSort();

        context.close();
    }
}
