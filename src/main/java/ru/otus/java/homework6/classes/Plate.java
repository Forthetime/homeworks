package ru.otus.java.homework6.classes;

public class Plate {
    private int maxAmount;
    private int currentAmount;

    public Plate(int maxAmount, int currentAmount) {
        this.maxAmount = maxAmount;
        this.currentAmount = currentAmount;
    }

    public int getMaxAmount() {
        return maxAmount;
    }

    public int getCurrentAmount() {
        return currentAmount;
    }

    public int addAmount(int amountAdd) {
        System.out.println("Добавляем в тарелку " + amountAdd + " у.е. еды");
        if ((currentAmount + amountAdd) > maxAmount) {
            System.out.println("Невозожно добавить еду, после добавления в тарелке окажется еды больше, чем max значение " + maxAmount);
        } else {
            System.out.println("current " + currentAmount);
            currentAmount += amountAdd;
            System.out.println("В тарелке стало " + currentAmount + " еды");

        }
        return currentAmount;
    }

    public boolean takeFood(int amountTake) {
        if (currentAmount - amountTake < 0) {
            System.out.println("В тарелке недостачно еды: " + currentAmount);
            return false;
        } else
            currentAmount -= amountTake;
        System.out.println("В тарелке осталось " + currentAmount + " еды");
        return true;
    }

    @Override
    public String toString() {
        return "Тарелка{" +
                "макс количество еды=" + maxAmount +
                ", текущее количество еды=" + currentAmount +
                '}';
    }
}
