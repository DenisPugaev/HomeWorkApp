package ru.geekbrains.lesson7;
//Created by: Denis

/*
Homework
for
lesson 7

 */
public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int amount) {
        if (amount <= getFood()) food -= amount;
    }

    public boolean addFood(int amount) {
        if (amount >= 0) {
            food += amount;
            System.out.println("В тарелку добавили: " + amount);
            System.out.println();
            return true;
        } else System.out.println("Добавлено неккоректное количество еды!");
        System.out.println();
        return false;

    }
}

