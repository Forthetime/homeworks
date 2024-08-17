package ru.otus.java.homework7;

public class Car implements Transport {
    private String name;
    private double fuelCarLevel;
    private double fuelCarСonsumption = 0.1;

    public Car(String name, double fuelCarLevel, double fuelCarСonsumption) {
        this.name = name;
        this.fuelCarLevel = fuelCarLevel;
        this.fuelCarСonsumption = fuelCarСonsumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFuelCarLevel() {
        return fuelCarLevel;
    }

    public void setFuelCarLevel(double fuelCarLevel) {
        this.fuelCarLevel = fuelCarLevel;
    }

    public double getFuelCarСonsumption() {
        return fuelCarСonsumption;
    }

    public void setFuelCarСonsumption(double fuelCarСonsumption) {
        this.fuelCarСonsumption = fuelCarСonsumption;
    }

    @Override
    public boolean drive(int distance,CurrentArea currentArea, Transport transport) {
        if (currentArea.getCurrentArea()== Area.FOREST || currentArea.getCurrentArea()== Area.SWAMP) {
            System.out.println("Машина не может передвигаться по местности" + currentArea);
            return false;
        } else {
            System.out.println("Машина может передвигаться по местности" + currentArea);
            if (fuelCarLevel <= 0 || fuelCarLevel<distance * fuelCarСonsumption) {
                System.out.println(" ,но недостаточно бензина ");
                return false;
            }
            else {
                System.out.println("Используя " + getName() + " проехал " + distance + " км");
                fuelCarLevel -= distance * fuelCarСonsumption;
                if (fuelCarLevel > 0) {
                    System.out.println("После поездки осталось бензина " + fuelCarLevel + " литров");
                } else {
                    System.out.println("После поездки не осталось бензина");
                }
            }
            return true;
        }
    }
}


