package ru.otus.java.homework7;

import static ru.otus.java.homework7.Area.*;

public class MainApplication7 {
    public static void main(String[] args) {
        Human human = new Human("Пётр");
        Car car = new Car("машина Toyota", 10, 2);
        Cycle cycle = new Cycle("велосипед Кама");
        OffRoader offRoader = new OffRoader("вездеход Cat", 12, 3);
        Horse horse = new Horse("лошадь Звездочка", 30, 20);


        human.getIn(car);
        human.move(2, SWAMP);
        human.getOff();
        human.getOff();
        human.getIn(offRoader);
        human.move(1, SWAMP);
        human.getOff();
        human.move(3, SWAMP);
        human.getIn(horse);
        human.move(1, FOREST);
    }
}



