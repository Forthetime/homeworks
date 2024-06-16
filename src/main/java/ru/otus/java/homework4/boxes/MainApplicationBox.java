package ru.otus.java.homework4.boxes;

import java.util.Arrays;

public class MainApplicationBox {
    public static void main(String[] args) {
        Box[] boxes = {
                new Box(15, 20, 30, "зеленый", true, true),
                new Box(25, 30, 17, "красный", false, true),
                new Box(17, 40, 20, "синий", true, false),
                new Box(17, 40, 20, "белый", false, false),

        };
        System.out.println(Arrays.toString(boxes));

        boxes[2].close();
        System.out.println(boxes[2]);

        boxes[3].putIntoBox();
        System.out.println(boxes[3]);


        boxes[3].takeFromBox();
        System.out.println(boxes[3]);

        boxes[0].setColour("розовый");
        System.out.println(boxes[0]);
    }
}