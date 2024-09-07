package ru.otus.java.homework7;

public class OffRoader implements Transport {
    private String name;
    private double fuelOffRoaderLevel;
    private double fuelOffRoaderСonsumption = 0.1;

    public OffRoader(String name, double fuelOffRoaderLevel, double fuelOffRoaderСonsumption) {
        this.name = name;
        this.fuelOffRoaderLevel = fuelOffRoaderLevel;
        this.fuelOffRoaderСonsumption = fuelOffRoaderСonsumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFuelOffRoaderLevel() {
        return fuelOffRoaderLevel;
    }

    public void setFuelOffRoaderLevel(double fuelOffRoaderLevel) {
        this.fuelOffRoaderLevel = fuelOffRoaderLevel;
    }

    public double getFuelOffRoaderСonsumption() {
        return fuelOffRoaderСonsumption;
    }

    public void setFuelOffRoaderСonsumption(double fuelOffRoaderСonsumption) {
        this.fuelOffRoaderСonsumption = fuelOffRoaderСonsumption;
    }

    @Override
    public boolean drive(int distance, Area area) {
        System.out.println("Вездеход может передвигаться по местности" + area);
        if (fuelOffRoaderLevel <= 0 || fuelOffRoaderLevel < distance * fuelOffRoaderСonsumption) {
            System.out.println(" ,но недостаточно бензина ");
            return false;
        }
        System.out.println("Используя внедорожник, проехал " + distance + " км");
        fuelOffRoaderLevel -= distance * fuelOffRoaderСonsumption;
        if (fuelOffRoaderLevel > 0) {
            System.out.println("После поездки осталось бензина " + fuelOffRoaderLevel + " литров");
        }
        System.out.println("После поездки не осталось бензина");
        return true;
    }
}
