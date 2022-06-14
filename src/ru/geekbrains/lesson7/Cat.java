package ru.geekbrains.lesson7;
//Created by: Denis

/*
Homework
for
lesson 7

 */
public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate p) {
        if (p.getFood() >= appetite) {
            p.decreaseFood(appetite);
            satiety = true;
            System.out.println("Кот " + getName() + " наелся!");
        } else System.out.println("Коту " + getName() + " не хватило еды, чтобы наесться!");
    }

    public String getName() {
        return name;
    }


    public boolean isSatiety() {
        return satiety;
    }


}

