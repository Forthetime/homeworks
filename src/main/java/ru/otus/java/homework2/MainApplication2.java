package ru.otus.java.homework2;

import java.util.Arrays;

public class MainApplication2 {
    public static void main(String[] args) {
        printNTimes("Тестовое сообщение", 5);
        sumArray(2, 3, 5, 7, 5, 6, 8);
        fillArrayWitnN(7, 3, 2, 2, 58, 9, 8, 100, -2);
        increaseArrayAndPrint(8, 3, 6, 2, 1, 20, 32, 5, 22);
        whichSumIsMore(6, 8, 9, 6, 20, 32, -2, 1, 2, 16);
    }

    private static void printNTimes(String X, int NTimes) {
        for (int i = 0; i < NTimes; i++) {
            System.out.println(X);

        }
    }

    private static void sumArray(int... arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }

    private static void fillArrayWitnN(int N, int... arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = N;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void increaseArrayAndPrint(int increase, int... arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + increase;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void whichSumIsMore(int... arr) {
        int leftsum = 0;
        int rightsum = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            leftsum += arr[i];
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            rightsum += arr[i];
        }
        if (leftsum > rightsum) {
            System.out.println("Сумма левой половины элементов массива больше правой");
        } else if ((leftsum < rightsum)){
            System.out.println("Сумма правой половины элементов массива больше левой");
        } else {
            System.out.println("Сумма элементов правой и левой половины массива равны");
        }
    }
}

