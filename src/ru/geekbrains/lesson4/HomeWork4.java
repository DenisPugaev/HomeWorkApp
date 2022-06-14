package ru.geekbrains.lesson4;
//Created by: Denis

/*
Homework
for
lesson 4
 */

import java.util.Random;
import java.util.Scanner;


public class HomeWork4 {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();
    static char[][] table;
    static int size = 3;
    static final char xMark = 'X';
    static final char oMark = 'O';
    static final char empty = '_';

    public static void main(String[] args) {
        initTable();
        System.out.println("Добро пожаловать в игру Крестики-нолики");
        while (true) {
            turnHuman();
            printTable();
            if (checkWin(xMark)) {
                System.out.println("Вы победили!");
                break;
            }
            if (isFullDraw()) {
                System.out.println("Ничья!");
                break;
            }
            turnAI();
            printTable();
            if (checkWin(oMark)) {
                System.out.println("Компьютер победил!");
                break;
            }
        }
    }

    private static boolean isFullDraw() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (table[i][j] == empty) return false;
            }
        }
        return true;
    }

    private static boolean checkWin(char symbol) {
        for (int i = 0; i < size; i++) {
            if (table[0][i] == symbol && table[1][i] == symbol && table[2][i] == symbol ||
                    table[i][0] == symbol && table[i][1] == symbol && table[i][2] == symbol) {
                if ((table[0][0] == symbol && table[1][1] == symbol && table[2][2] == symbol) ||
                        (table[2][0] == symbol && table[1][1] == symbol && table[0][2] == symbol)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean correctValue(int x, int y) {
        if (x >= size || y >= size || x < 0 || y < 0) {
            System.out.println("Введены некорректные координаты!");
            return true;
        }
        if (table[x][y] == empty) return false;
        return true;
    }

    private static void turnHuman() {
        int x, y;
        do {
            System.out.println("Введите X и Y  в диапозоне от 1 до 3");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (correctValue(x, y));
        System.out.println();
        System.out.println("Ваш ход: [" + (x + 1) + "," + (y + 1) + "]");
        table[x][y] = xMark;
    }

    private static void turnAI() {
        int x;
        int y;
        do {
            x = rand.nextInt(size);
            y = rand.nextInt(size);
        } while (correctValue(x, y));
        System.out.println();
        System.out.println("Ход компьютера: [" + (x + 1) + "," + (y + 1) + "]");
        table[x][y] = oMark;
    }

    private static void printTable() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("|" + table[i][j] + "|");
            }
            System.out.println();
        }
    }

    private static void initTable() {
        table = new char[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = empty;
            }
        }
    }

}


