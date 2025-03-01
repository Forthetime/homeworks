package ru.otus.java.homework_testing;

public class MainApplication {

    public static void main(String[] args) {
    }

    public static int[] returnArrayAfterOne(int... arr) {
        int position = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                position = i;
            }
            ;
        }
        int[] arr2 = new int[arr.length - position - 1];
        if (position < 0) {
            throw new RuntimeException("Неверный размер массива");
        }
        else  {
            for (int i = position + 1, j = 0; i < arr.length; i++, j++) {
                arr2[j] = arr[i];
            }
        }
        return arr2;
    }

    public static boolean consistOfOneAndTwo(int... arr) {
        boolean hasOne = false;
        boolean hasTwo = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                hasOne=true;
            }
            if (arr[i] == 2) {
               hasTwo=true;
            }
        }
        return hasOne && hasTwo;
    }
}
