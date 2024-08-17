package ru.otus.java.homework7;

public class CurrentArea {
    private Area currentArea;

    public Area getCurrentArea() {
        return currentArea;
    }

    public void setCurrentArea(Area currentArea) {
        this.currentArea = currentArea;
    }

    public CurrentArea(Area currentArea) {
        this.currentArea = currentArea;
    }

    @Override
    public String toString() {
        return " " +
               currentArea;
    }
}
