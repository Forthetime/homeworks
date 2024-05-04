package ru.otus.java.homework1;

import java.util.Random;

public class MainApplication {
    public static void main(String[] args) {
        greetings();
        checkSign();
        selectColor();
        compareNumbers();
        addOrSubtractAndPrint();
    }

    public static void greetings() {
        System.out.println("Hello \nWorld \nfrom \nJava");
    }

    public static void checkSign() {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        int c = (int) (Math.random() * 100);
        int result;
        result = a + b + c;
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
        }
        if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        }
        if (data > 20) {
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

    public static void addOrSubtractAndPrint() {
        int initValue = (int) (Math.random() * 100);
        int delta = (int) (Math.random() * 100);
        Random random = new Random();
        boolean increment = random.nextBoolean();
        System.out.println(initValue);
        System.out.println(delta);
        System.out.println(increment);
        if (increment == true) {
            initValue = initValue + delta;
            System.out.println(initValue);
        }
        if (increment == false) {
            initValue = initValue - delta;
            System.out.println(initValue);
        }
    }
}