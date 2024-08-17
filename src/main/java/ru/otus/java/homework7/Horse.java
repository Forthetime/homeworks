package ru.otus.java.homework7;

public class Horse implements Transport {

    private String name;
    private double horsePower;
    private double horsePowerСonsumption = 0.5;

    public Horse(String name, double horsePower, double horsePowerСonsumption) {
        this.name = name;
        this.horsePower = horsePower;
        this.horsePowerСonsumption = horsePowerСonsumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    public double getHorsePowerСonsumption() {
        return horsePowerСonsumption;
    }

    public void setHorsePowerСonsumption(double horsePowerСonsumption) {
        this.horsePowerСonsumption = horsePowerСonsumption;
    }

    @Override
    public boolean drive(int distance,CurrentArea currentArea, Transport transport) {
        if (currentArea.getCurrentArea()== Area.SWAMP) {
            System.out.println("Лошадь не может передвигаться по местности" + currentArea);
            return false;
        } else {
            System.out.println("Лошадь может передвигаться по местности" + currentArea);
            if (horsePower <= 0 || horsePower<distance * horsePowerСonsumption) {
                System.out.println(" ,но недостаточно сил ");
                return false;
            }
            else {
                System.out.println("Потратив " + distance * horsePowerСonsumption + " ед.сил, лошадь прошла " + distance + " км");
                horsePower -= distance * horsePowerСonsumption;
                if (horsePower > 0) {
                    System.out.println("После пройденного расстоянния осталось " + horsePower + " ед. лошадиных сил");
                } else {
                    System.out.println("После пройденного расстояния у лошади не осталось сил");
                }
            }
            return true;
        }
    }
}



