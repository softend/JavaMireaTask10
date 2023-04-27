package ru.zenchenko.task10;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        //Берем контекст
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        //Берем бин
        SortingAlgorythm algorythm = context.getBean(args[0], SortingAlgorythm.class);
        //Метод сортировки
        algorythm.doSort();
        //Закрываем контекст
        context.close();
    }
}
