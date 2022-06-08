package ru.geekbrains.lesson5;
//Created by: Denis

/*
Homework
for
lesson 5
.......
4. Создать массив из 5 сотрудников.
Пример:
Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312",
30000, 30); // потом для каждой ячейки массива задаем объект
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);
5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет
 */

public class AppMain {
    public static void main(String[] args) {

        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Таисия", "Ягодкина", "Игоревна", "Врач", "yagoda@mail.com", "35-24-34", 25000, 35);
        empArray[1] = new Employee("Мартин", "Котов", "Васильевич", "Слесарь", "kotShatun@mail.com", "36-28-24", 40000, 42);
        empArray[2] = new Employee("Тамара", "Хомякова", "Геннадевна", "Швея", "xomyakTamara@mail.com", "32-78-84", 20000, 64);
        empArray[3] = new Employee("Альберт", "Голубцов", "Амирович", "Дизайнер", "tophata@mail.com", "33-77-33", 135000, 38);
        empArray[4] = new Employee("Светлана", "Макарова", "Игоревна", "Ветеринарный врач", "doctorayibolit@mail.com", "55-35-35", 70000, 24);

        System.out.println("Список сотрудников возраст которых превышает 40 лет:");
        System.out.println();
        for (int i = 0; i < empArray.length; i++) {
            if (empArray[i].getAge() > 40) {
                empArray[i].toInfo();
            }
        }
    }
}

