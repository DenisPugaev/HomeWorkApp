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

public class TrainingArea {
    public static void main(String[] args) {
        int numberOfStages = 3; // количество раундов соревнования в беге и заплыве
        int initialDistanceRun = 100;//  начальная дистанция бега
        int distanceStepRun = 150;// шаг бега который увеличивется с каждым новым раундом
        int initialDistanceSwim = 5;// начальная дистанция заплыва
        int distanceStepSwim = 3;// шаг заплыва который увеличивется с каждым новым раундом

        Dog dog1 = new Dog("Шарик", 0, 0);
        Dog dog2 = new Dog("Рекс", 0, 0);
        Cat cat1 = new Cat("Мартин", 0, 0);

        System.out.println("Добро пожаловать на тренировочную площадку! " + "Всего участинков: " + (Dog.countDog + Cat.countCats) + " |" + " Котов - " + Cat.countCats + " |" + " Собак - " + Dog.countDog);
        System.out.println("--------------------");
        System.out.println("Начинаем забег! СТАРТ!");
        for (int i = 0; i < numberOfStages; i++) {
            dog1.setRun(initialDistanceRun);
            dog2.setRun(initialDistanceRun);
            cat1.setRun(initialDistanceRun);

            dog1.torun();
            dog2.torun();
            cat1.torun();

            initialDistanceRun = initialDistanceRun + distanceStepRun;
        }
        System.out.println("--------------------");
        System.out.println("Начинаем заплыв! СТАРТ!");
        for (int i = 0; i < numberOfStages; i++) {
            dog1.setSwim(initialDistanceSwim);
            dog2.setSwim(initialDistanceSwim);
            cat1.setSwim(initialDistanceSwim);

            dog1.toswim();
            dog2.toswim();
            cat1.toswim();

            initialDistanceSwim = initialDistanceSwim + distanceStepSwim;
        }
    }
}
