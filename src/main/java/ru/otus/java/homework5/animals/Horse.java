package ru.otus.java.homework5.animals;

public class Horse extends Animal {
    int swimEnduranceConsumption = 4;

    public Horse(String name, double speedRun, double speedSwim, int endurance) {
        super(name, speedRun, speedSwim, endurance);
    }

    @Override
    public double swim(int distance) {
        if (endurance > 0) {
            double time = distance / speedSwim;
            System.out.println(name + " проплыл " + distance + " м" + " за " + time + " сек");
            endurance = endurance - distance * swimEnduranceConsumption;
            if (endurance > 0) {
                System.out.println("У " + name + " осталась выносливость: " + endurance);
            } else {
                System.out.println("У " + name + " появилось состояние усталости");
            }
            return time;
        } else {
            double time;
            System.out.println(name + " не может плыть, у " + name + " не хватает выносливовсти");
            return time = -1;
        }
    }
}
