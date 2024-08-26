package ru.otus.java.homework8;

import java.util.Arrays;

public class MainApplication8 {
    public static void main(String[] args) {
        String[][] arr = {{"1", "2", "3","4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}};
        try {
            sumArray(arr);
        } catch (AppArraySizeException e) {
            System.out.println("Неверный размер массива");
        } catch (AppArrayDataException e) {
            System.out.println("Неверный формат элементов массива");
        }
    }

    private static int sumArray(String[][] arr) {
        int size1 = arr.length;
        int size2 = arr[0].length;
        if (size1 != 4 || size2 != 4) {
            throw new AppArraySizeException("Неверный размер массива");
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (AppArrayDataException e) {
                    throw new AppArrayDataException("Неверный формат ячейки в строке : " + i + ",столбце  " + j);
                }
            }
        }
        return sum;
        System.out.print(sum);
    }
}