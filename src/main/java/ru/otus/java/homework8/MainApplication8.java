package ru.otus.java.homework8;

import java.util.Arrays;

public class MainApplication8 {
    public static void main(String[] args) {
        String[][] arr = {{"1", "2", "3", "4"},
                {"2", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}};
        try {
            sumArray(arr);
        } catch (AppArraySizeException e) {
            System.out.println("Неверный размер массива");
        } catch (AppArrayDataException e) {
            System.out.println("Неверный формат элементов массива");
        }
        System.out.println(sumArray(arr));
    }

    private static int sumArray(String[][] arr) {
        if (arr.length != 4 || arr[0].length != 4) {
            throw new AppArraySizeException("Неверный размер массива");
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                int m = i + 1;
                int n = j + 1;
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException("Неверный формат ячейки в строке : " + m + ",столбце " + n);
                }
            }
        }
        return sum;
    }
}