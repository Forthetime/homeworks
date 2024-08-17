package ru.otus.java.homework7;

public class Cycle implements Transport {
    private String name;

    public Cycle(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean drive(int distance, CurrentArea currentArea, Transport transport) {
        if (currentArea.getCurrentArea()== Area.SWAMP) {
            System.out.println("Велосипед не может передвигаться по местности " + currentArea);
            return false;
        } else {
            System.out.println("Велосипед может передвигаться по местности"+ currentArea);
                System.out.println("Используя велосипед," + " проехал " + distance + " км");
            }
            return true;
        }
    }


