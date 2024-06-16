package ru.otus.java.homework4.boxes;

public class Box {
    private int length;
    private int width;
    private int height;
    private String colour;
    private boolean isOpened;
    private boolean isEmptyBox;

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean getIsOpened() {
        return isOpened;
    }

    public boolean getIsEmptyBox() {
        return isEmptyBox;
    }

    public Box(int length, int width, int hight, String colour, boolean isOpened, boolean isEmptyBox) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.colour = colour;
        this.isOpened = isOpened;
        this.isEmptyBox = isEmptyBox;
    }

    public void open() {
        System.out.println("Открыть коробку");
        if (isOpened == false) {
            isOpened=true;
            System.out.println("Коробка открыта");
        } else {
            System.out.println("Коробка уже была открыта");
        }
    }

    public void close() {
        System.out.println("Закрыть коробку");
        if (isOpened == true) {
            isOpened=false;
            System.out.println("Коробка закрыта");
        } else {
            System.out.println("Коробка уже была закрыта");
        }
    }

    public void putIntoBox() {
        System.out.println("Сложить предмет в коробку");
        if (isOpened == true && isEmptyBox == true) {
            isEmptyBox=false;
            System.out.println("В коробку сложен предмет");
        }
        if (isOpened == true && isEmptyBox == false) {
            System.out.println("В коробке уже есть предмет");
        }
        if (isOpened == false && isEmptyBox == true) {
            System.out.println("Коробка закрыта и пустая");
        }
        if (isOpened == false && isEmptyBox == false) {
            System.out.println("Коробка закрыта и с предметом");
        }
    }

    public void takeFromBox() {
        System.out.println("Убрать предмет из коробки");
        if (isOpened == true && isEmptyBox == false) {
            isEmptyBox=false;
            System.out.println("Из коробки убран предмет");
        }
        if (isOpened == true && isEmptyBox == true) {
            System.out.println("Коробка открыта и пустая");
        }
        if (isOpened == false && isEmptyBox == true) {
            System.out.println("Коробка закрыта и пустая");
        }
        if (isOpened == false && isEmptyBox == false) {
            System.out.println("Коробка закрыта и с предметом");
        }
    }

    @Override
    public String toString() {
        return "Размеры: длина " + this.length + "," + " ширина " + this.width + "," + " высота " + this.height + " Цвет: " + this.colour + " Коробка открыта? - " + this.isOpened + " Коробка пустая? - " + this.isEmptyBox;
    }
}


