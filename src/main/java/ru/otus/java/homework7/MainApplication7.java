package ru.otus.java.homework7;

import static ru.otus.java.homework7.Area.*;

public class MainApplication7 {
    public static void main(String[] args) {
        Human human = new Human("Пётр");
        Car car = new Car("машина Toyota", 10, 2);
        Cycle cycle = new Cycle("велосипед Кама");
        OffRoader offRoader = new OffRoader("вездеход Cat", 12, 3);
        Horse horse = new Horse("лошадь Звездочка", 30, 20);

        CurrentArea currentArea = new CurrentArea(SWAMP);

        human.getIn(car);
        human.move(2, currentArea);
        human.getOff(car);
        human.getOff(horse);
        human.getIn(offRoader);
        human.move(1, currentArea);
        human.getOff(cycle);
        human.move(3, currentArea);
        CurrentArea currentArea2 = new CurrentArea(FOREST);
        human.getIn(horse);
        human.move(1, currentArea2);
    }
}



