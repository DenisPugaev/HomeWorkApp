package ru.geekbrains.lesson7;
//Created by: Denis

import java.util.Scanner;

/*
Homework
for
lesson 7

Задача:
1. Расширить задачу про котов и тарелки с едой.
2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Plate plate = new Plate(0);

        Cat[] cat = new Cat[5];
        cat[0] = new Cat("Барсик", 30, false);
        cat[1] = new Cat("Мартин", 50, false);
        cat[2] = new Cat("Лукас", 20, false);
        cat[3] = new Cat("Томас", 40, false);
        cat[4] = new Cat("Фреди", 25, false);

        System.out.println("Сколько еды насыпать котам? Введите число: ");
        int addAmountFood = sc.nextInt(); // Количество еды добавляемое в тарелку, для удобства реализовано через консоль;

        if (plate.addFood(addAmountFood)) {
            for (Cat c : cat) {
                c.eat(plate);
                if (c.isSatiety()) {
                    System.out.println("Кот сытый");
                } else System.out.println("Кот голоден");
                System.out.println("В тарелке осталось: " + plate.getFood());
                System.out.println();
            }
        }
    }
}
