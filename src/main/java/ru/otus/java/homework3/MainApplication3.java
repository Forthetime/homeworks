package ru.otus.java.homework3;

public class MainApplication3 {

    public static void main(String[] args) {
        int[][] array = {{1, 2, 123}, {7, -8, -11}, {1, 0, 120003}};
        int[][] array2 = {{7, 8, 326}, {72, 811, 101}, {-1, 0, -120003}};
        sumOfPositiveElements(array);
        print2DArray(6);
        findMax(array);
        System.out.println(findMax(array));
        sumOfElementsSecondRow(array);
        fillDiagonalWith0(array2);
    }

    public static int sumOfPositiveElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println(sum);
        return sum;
    }

    private static void print2DArray(int size) {
        int rows = size;
        int columns = size;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void fillDiagonalWith0(int[][] array2) {
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                if (i == j) {
                    array2[i][j] = 0;
                }
            }
        }
    }

    public static int findMax(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] >= max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public static int sumOfElementsSecondRow(int[][] array) {
        int sumSecondRow = 0;
        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i >= 1)
                    sumSecondRow += array[1][j];
                else sumSecondRow = -1;
            }
        }
        System.out.println(sumSecondRow);
        return sumSecondRow;
    }

}
