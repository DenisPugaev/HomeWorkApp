package ru.geekbrains.lesson5;
//Created by: Denis

/*
Homework
for
lesson 5

Задача:
1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
2. Конструктор класса должен заполнять эти поля при создании объекта.
3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в
консоль.
........
 */
class Employee {
    private final String firstName;
    private final String lastName;
    private final String patronymic;
    private final String post;
    private final String email;
    private final String phoneNumber;
    private final int salary;
    private final int age;

    public Employee(String firstName, String lastName, String patronymic, String post, String email, String phoneNumber, int salary, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void toInfo() {
        System.out.println("ФИО: " + lastName + " " + firstName + " " + patronymic + " |" + " Возраст: " + age);
        System.out.println("Должность: " + post + " |" + " Зарплата: " + salary);
        System.out.println("E-mail: " + email + " |" + " Номер телефона: " + phoneNumber);
        System.out.println("------------------------------------------------------");
    }

    public int getAge() {
        return age;
    }
}





