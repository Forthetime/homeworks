package ru.otus.java.homework5.animals;

public abstract class Animal {
    String name;
    double speedRun;
    double speedSwim;
    int endurance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeedRun() {
        return speedRun;
    }

    public void setSpeedRun(Double speedRun) {
        this.speedRun = speedRun;
    }

    public double getSpeedSwim() {
        return speedSwim;
    }

    public void setSpeedSwim(Double speedSwim) {
        this.speedSwim = speedSwim;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public Animal(String name, double speedRun, double speedSwim, int endurance) {
        this.name = name;
        this.speedRun = speedRun;
        this.endurance = endurance;
        this.speedSwim = speedSwim;
    }

    public double run(int distance) {
        if (endurance <= 0) {
            System.out.println(name + " не может бежать, у " + name + " не хватает выносливости");
            return -1;
        }
        double time = distance / speedRun;
        System.out.println(name + " пробежал " + distance + " м" + " за " + time + " сек");
        endurance -= distance ;
        if (endurance > 0) {
            System.out.println("У " + name + " осталась выносливость: " + endurance);
        } else {
            System.out.println("У " + name + " появилось состояние усталости");
        }
        return time;
    }
    public abstract double swim(int distance);

    public void info() {
        if (endurance > 0) {
            System.out.println("Имя:" + name + " Скорость бега м/с " + speedRun + " Скорость плавания м/с " + speedSwim + " Выносливость " + endurance);
        } else {
            System.out.println("Имя:" + name + " Скорость бега м/с " + speedRun + " Скорость плавания м/с " + speedSwim + " Выносливость израсходована");
        }
    }
}
