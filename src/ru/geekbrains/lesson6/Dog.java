package ru.geekbrains.lesson6;
//Created by: Denis

/*
Homework
for
lesson 6
 */
public class Dog extends Animal {
    protected static int countDog;


    public Dog(String name, int run, int swim) {
        super(name, run, swim);
        countDog++;
    }


    @Override
    public void torun() {
        if (getRun() > 500) {
            System.out.println(getName() + " не смог пробежать " + getRun() + "м Выдохся!");
        } else System.out.println(getName() + " пробежал " + getRun() + "м");
    }

    @Override
    public void toswim() {
        if (getSwim() > 10) {
            System.out.println(getName() + " не смог проплыть " + getSwim() + "м  Гребёт к берегу!");
        } else System.out.println(getName() + " проплыл " + getSwim() + "м");
    }
}