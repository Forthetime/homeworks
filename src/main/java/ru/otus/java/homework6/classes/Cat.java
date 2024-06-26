package ru.otus.java.homework6.classes;

public class Cat {
    private String name;
    private int amountTake;
    private boolean satiety;

    public Cat(String name, int amountTake) {
        this.name = name;
        this.amountTake = amountTake;
//        this.satiety = false;
    }

    public String getName() {
        return name;
    }

    public int amountTake() {
        return amountTake;
    }

    public boolean hungry() {
        return satiety;
    }

    public int eat(Plate plate) {
        if (satiety) {
            System.out.println(name + " сыт");
        }

        if (plate.getCurrentAmount() >= amountTake()) {
            System.out.println(name + " поел " + amountTake + " у.е. еды");
            plate.takeFood(amountTake);
            satiety = true;

        } else {
            System.out.println(name + " не смог поесть, т.к. еды для него мало");
        }
        return plate.getCurrentAmount();
    }

    @Override
    public String toString() {
        return "Кот{" +
                "Имя='" + name + '\'' +
                ", Аппетит=" + amountTake +
                ", Сыт=" + satiety +
                '}';
    }
}
