package ru.geekbrains.lesson2;
//Created by: Denis

/*
Homework
for
lesson 2
 */

public class HomeWork2 {

    public static void main(String[] args) {
        sumOfNumbers(4, 6);
        numberX(-7);
        numberY(-1);
        repeater2000("Ура!", 3);
        leapYear(2020);
    }

    public static void sumOfNumbers(int a, int b) {
        boolean x = false;
        if (10 <= a + b && a + b <= 20) x = true;
        System.out.println(x);
    }

    public static void numberX(int x) {
        if (x >= 0) System.out.println("Число: " + x + "  положительное.");
        else System.out.println("Число: " + x + "  отрицательное.");
    }

    public static boolean numberY(int y) {
        if (y > 0) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
        }
        return false;
    }

    public static void repeater2000(String a, int b) {
        while (b > 0) {
            System.out.println(a);
            b--;
        }
    }

    public static boolean leapYear(int x) {
        if (x % 4 == 0 && x % 100 != 0 || x % 400 == 0) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }
}