package ru.geekbrains.lesson3;
//Created by: Denis

/*
Homework
for
lesson 3
 */


import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
        array1();
        array2();
        array3();
        array4();
        array5(5, 6);
        array6();
        int[] arr7 = {1, 3, 2, 2,};
        array7(arr7);
        System.out.println(array7(arr7));
    }

    private static void array1() {
        int[] numbers = {1, 1, 1, 0, 1};
        for (int i = 0; i < numbers.length; i++) {
            if (1 == numbers[i]) numbers[i] = 0;
            else numbers[i] = 1;
        }
        System.out.println(Arrays.toString(numbers));
    }

    private static void array2() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void array3() {
        int[] arrMulti = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrMulti.length; i++) {
            if (arrMulti[i] < 6) arrMulti[i] *= 2;
        }
        System.out.println(Arrays.toString(arrMulti));
    }

    private static void array4() {
        int a = 5;
        int[][] square = new int[a][a];
        for (int i = 0; i < square.length; i++) {
            if (square[i][i] == square[i][i]) {
                square[i][i] = 1;
            }
        }
        for (int i = 0; i < square.length; i++) {
            if (square[i][i] == square[i][i]) {
                square[i][a - 1 - i] = 1;
            }
            System.out.println(Arrays.toString(square[i]));
        }
    }

    private static void array5(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));

    }

    private static void array6() {
        int[] arr = {5, 23, 53, 1, 9, 4};
        int max = arr[0], min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] >= max) max = arr[j];
        }
        System.out.println("Минимальное число в массиве arr: " + min);
        System.out.println("Максимальное  число в массиве arr: " + max);
    }

    private static boolean array7(int[] arr) {
        int leftSum = 0, rightSum = 0;
        for (int i = 0; i < arr.length; i++) rightSum += arr[i];
        for (int j = 0; j < arr.length; j++) {
            leftSum += arr[j];
            if (leftSum == rightSum - leftSum) {

                return true;
            }
        }
        return false;
    }
}















