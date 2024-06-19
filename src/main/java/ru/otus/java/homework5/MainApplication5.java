package ru.otus.java.homework5;

public class MainApplication5 {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Barsik", 6, 0, 150),
                new Dog("Bobik", 7, 5, 15),
                new Horse("Star", 10, 4, 200),
        };

        for (int i = 0; i < animals.length; i++) {
            animals[i].run(90);
            animals[i].swim(10);
            animals[i].info();
        }
    }
}