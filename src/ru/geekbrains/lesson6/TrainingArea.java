package ru.geekbrains.lesson6;
//Created by: Denis

/*
Homework
for
lesson 6
1. Создать классы Собака и Кот с наследованием от класса Животное.
2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
4. * Добавить подсчет созданных котов, собак и животных.
 */

import java.lang.reflect.Array;

public class TrainingArea {
    public static void main(String[] args) {
        int numberOfStages = 3; // количество раундов соревнования в беге и заплыве
        int initialDistanceRun = 100;//  начальная дистанция бега
        int distanceStepRun = 150;// шаг бега который увеличивется с каждым новым раундом
        int initialDistanceSwim = 5;// начальная дистанция заплыва
        int distanceStepSwim = 3;// шаг заплыва который увеличивется с каждым новым раундом

        Dog[] dog = new Dog[2];
        dog[0] = new Dog("Шарик", 0, 0);
        dog[1] = new Dog("Рекс", 0, 0);

        Cat[] cat = new Cat[2];
        cat[0] = new Cat("Мартин", 0, 0);
        cat[1] = new Cat("Cэм", 0, 0);

        System.out.println("Добро пожаловать на тренировочную площадку! " + "Всего участинков: " + (Dog.countDog + Cat.countCats) + " |" + " Котов - " + Cat.countCats + " |" + " Собак - " + Dog.countDog);
        System.out.println("--------------------");
        System.out.println("Начинаем забег! СТАРТ!");
        for (int i = 0; i < numberOfStages; i++) {
            dog[0].setRun(initialDistanceRun);
            dog[1].setRun(initialDistanceRun);
            cat[0].setRun(initialDistanceRun);
            cat[1].setRun(initialDistanceRun);
            cat[0].setRun(initialDistanceRun);

            dog[0].torun();
            dog[1].torun();
            cat[0].torun();
            cat[1].torun();

            initialDistanceRun = initialDistanceRun + distanceStepRun;
            System.out.println();
        }
        System.out.println("--------------------");
        System.out.println("Начинаем заплыв! СТАРТ!");
        for (int i = 0; i < numberOfStages; i++) {
            dog[0].setSwim(initialDistanceSwim);
            dog[1].setSwim(initialDistanceSwim);
            cat[0].setSwim(initialDistanceSwim);
            cat[1].setSwim(initialDistanceSwim);

            dog[0].toswim();
            dog[1].toswim();
            cat[0].toswim();
            cat[1].toswim();

            initialDistanceSwim = initialDistanceSwim + distanceStepSwim;
            System.out.println();
        }
    }
}
