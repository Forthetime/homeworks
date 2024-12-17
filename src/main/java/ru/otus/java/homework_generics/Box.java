package ru.otus.java.homework_generics;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> grocery = new ArrayList<>();
    private float weightOfBox;

    public Box(List<T> grocery) {
        this.grocery = grocery;
    }

    public Box() {
    }

    public float getWeightOfBox() {
        return weightOfBox;
    }

    public void setWeightOfBox(float weightOfBox) {
        this.weightOfBox = weightOfBox;
    }

    @Override
    public String toString() {
        return "Box{" +
                "grocery=" + grocery +
                '}';
    }

    public void addFruit(T fruit) {
        grocery.add(fruit);

    }

    public float calculateWeight() {
        float weightOfBox=0;
        for (Fruit o : grocery) {
            weightOfBox += o.getWeight();
        }
        System.out.println(weightOfBox);
        return weightOfBox;
    }

    public boolean compareWeightOfBoxes(Box boxAnother) {
        if (this.calculateWeight() == boxAnother.calculateWeight()) {
            System.out.println("вес коробок равен");
            return true;
        }
        System.out.println("вес коробок не равен");
        return false;
    }

    public void poar(Box<? extends T> boxFromWhichTake) {  //boxFromWhichTake коробка, из которой пересыпаем
        this.grocery.addAll(boxFromWhichTake.grocery);
        boxFromWhichTake.grocery.clear();
        System.out.println("Коробка, в которую пересыпали:"+this);
        System.out.println("Коробка, из которой пересыпаем:"+boxFromWhichTake);
    }
}


