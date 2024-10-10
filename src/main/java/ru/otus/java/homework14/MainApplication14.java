package ru.otus.java.homework14;

public class MainApplication14 {
    public static void main(String[] args) {
        double[] array = new double[100000000];
        fillArray(array);
        fillArrayThread(array);
    }

    private static void fillArray(double[] array) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
        System.out.println(System.currentTimeMillis() - time);
    }

    private static void fillArrayThread(double[] array) {
        long time1 = System.currentTimeMillis();
        Thread[] myThreads = new Thread[4];
        myThreads[0] = new Thread(() -> {
            for (int i = 0; i < array.length / 4; i++) {
                array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });

        myThreads[1] = new Thread(() -> {
            for (int i = array.length / 4; i < array.length / 2; i++) {
                array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });

        myThreads[2] = new Thread(() -> {
            for (int i = array.length / 2; i < array.length * 0.75; i++) {
                array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });

        myThreads[3] = new Thread(() -> {
            for (int i = array.length * 3 / 4; i < array.length; i++) {
                array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        });

        for (int j = 0; j < 4; j++) {
            myThreads[j].start();
        }
        for (int j = 0; j < 4; j++) {
            try {
                myThreads[j].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(System.currentTimeMillis() - time1);
    }
}

