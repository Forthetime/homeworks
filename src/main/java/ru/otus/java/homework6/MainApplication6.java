package ru.otus.java.homework6;

import ru.otus.java.homework6.classes.Cat;
import ru.otus.java.homework6.classes.Plate;

import java.util.Arrays;

public class MainApplication6 {
    public static void main(String[] args) {
        Plate plate1 = new Plate(7, 7);
        Cat[] cats = {
                new Cat("Kitty I", 6),
                new Cat("Kitty II", 3),
        };
        System.out.println(Arrays.toString(cats));
        System.out.println(plate1);
        plate1.addAmount(5);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate1);
        }
        System.out.println(Arrays.toString(cats));
    }
}
