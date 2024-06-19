package ru.otus.java.homework5;

public class Cat extends Animal {

    public Cat(String name, double speedRun, double speedSwim, int endurance) {
        super(name, speedRun, speedSwim, endurance);
    }

    @Override
    public double swim(int distance) {
        System.out.println(name + " не умеет плавать");
        return -1;
    }

}
