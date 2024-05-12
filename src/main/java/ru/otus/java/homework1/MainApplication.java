package ru.otus.java.homework1;

public class MainApplication {
    public static void main(String[] args) {
        greetings();
        checkSign((int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100));
        selectColor();
        compareNumbers();
        addOrSubtractAndPrint((int) (Math.random() * 100), (int) (Math.random() * 100), Math.random() < 0.5);
    }

    public static void greetings() {
        System.out.println("Hello \nWorld \nfrom \nJava");
    }

    public static void checkSign(int a, int b, int c) {
        int result = a + b + c;
        if (result >= 0) {
            System.out.println("Сумма положительная");
        }
        if (result < 0) {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColor() {
        int data = (int) (Math.random() * 100);
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println(" a < b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            initValue = initValue + delta;
            System.out.println(initValue);
        }
        if (!increment) {
            initValue = initValue - delta;
            System.out.println(initValue);
        }
    }
}