package ru.geekbrains;
//Created by: Denis

/*
Homework
for
lesson 1
 */

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = -7;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма чисел a и b положительная. Равна = " + sum);
        } else {
            System.out.println("Сумма чисел a и b отрицательная. Равна = " + sum);
        }
    }

    public static void printColor() {
        int value = 77;
        if (value<=0){
            System.out.println("Красный");
        }
        else if (0<value && value<100){
            System.out.println("Желтый");
        }
        else if(value>100) {
            System.out.println("Красный");
        }
    }

    public static void compareNumbers() {
        int a = 26;
        int b = 95;
        if(a >= b){
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
}