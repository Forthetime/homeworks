package ru.otus.java.homework_generics;

public class MainApplication {
    public static void main(String[] args) {
        Apple apple = new Apple(20);
        Orange orange1 = new Orange(32);
        Box<Orange> orangeBox1 = new Box<>();
        Box<Apple> appleBox1 = new Box<>();
        Box<Fruit> mixBox1 = new Box<>();
        orangeBox1.addFruit(orange1);
        orangeBox1.addFruit(new Orange(16));
        mixBox1.addFruit(new Orange(20));
        mixBox1.addFruit(new Apple(28));
        System.out.println(orangeBox1);
        appleBox1.addFruit(apple);
        appleBox1.addFruit(new Apple(34));
        System.out.println(appleBox1);
        orangeBox1.calculateWeight();
        appleBox1.calculateWeight();
        mixBox1.calculateWeight();
        orangeBox1.compareWeightOfBoxes(mixBox1);
        mixBox1.poar(mixBox1);
        mixBox1.calculateWeight();
        mixBox1.calculateWeight();
    }
}
