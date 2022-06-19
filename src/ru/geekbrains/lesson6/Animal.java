package ru.geekbrains.lesson6;
//Created by: Denis

/*
Homework
for
lesson 6
 */
public abstract class Animal {
    private String name;
    private int run;
    private int swim;

    public Animal(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
    }


    public void torun() {

    }

    public void toswim() {

    }

    public String getName() {
        return name;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }
}
