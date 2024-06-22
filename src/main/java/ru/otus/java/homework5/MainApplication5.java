package ru.otus.java.homework5;

import ru.otus.java.homework5.animals.Animal;
import ru.otus.java.homework5.animals.Cat;
import ru.otus.java.homework5.animals.Dog;
import ru.otus.java.homework5.animals.Horse;

public class MainApplication5 {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Barsik", 6, 0, 150),
                new Dog("Bobik", 7, 5, 15),
                new Horse("Star", 10, 4, 200),
        };

        for (int i = 0; i < animals.length; i++) {
            animals[i].run(90);
            animals[i].run(9);
            animals[i].run(1);
            animals[i].swim(100);
            animals[i].swim(1);
            animals[i].info();
        }
    }
}