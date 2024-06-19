package ru.otus.java.homework5;

public class Dog extends Animal {
    int enduranceConsumption = 2;

    public Dog(String name, double speedRun, double speedSwim, int endurance) {
        super(name, speedRun, speedSwim, endurance);
    }

    @Override
    public double swim(int distance) {
        double time = distance / speedSwim;
        System.out.println(name + " проплыл " + distance + " м" + " за " + time + " сек");
        endurance = endurance - distance * enduranceConsumption;
        if (endurance > 0) {
            System.out.println("У " + name + " осталась выносливость: " + endurance);
            return time;
        } else {
            System.out.println("У " + name + " появилось состояние усталости");
            return time = -1;
        }
    }

}
