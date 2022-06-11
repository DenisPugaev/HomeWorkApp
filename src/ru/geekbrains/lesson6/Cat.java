package ru.geekbrains.lesson6;
//Created by: Denis

/*
Homework
for
lesson 6
 */
public class Cat extends Animal {
    protected static int countCats;


    public Cat(String name, int run, int swim) {
        super(name, run, swim);
        countCats++;
    }

    @Override
    public void torun() {
        if (getRun() > 200) {
            System.out.println(getName() + " не смог пробежать " + getRun() + "м Выдохся!!");
        } else System.out.println(getName() + " пробежал " + getRun() + "м");

    }

    @Override
    public void toswim() {
        System.out.println("Упс! кажется " + getName() + " боится воды!");
    }
}
