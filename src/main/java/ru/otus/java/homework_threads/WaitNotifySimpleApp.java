package ru.otus.java.homework_threads;

public class WaitNotifySimpleApp {

    private final Object mon = new Object();
    private Printer printer = new Printer();
    private char lastLetter = 'C';

    public static void main(String[] args) {
        WaitNotifySimpleApp waitNotifyApp = new WaitNotifySimpleApp();
        new Thread(() -> waitNotifyApp.printLettter('A')).start();
        new Thread(() -> waitNotifyApp.printLettter('B')).start();
        new Thread(() -> waitNotifyApp.printLettter('C')).start();
    }

    public void printLettter(char letter) {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (getNextLetter() != letter) {
                        mon.wait();
                    }
                    printer.print(letter);
                    lastLetter = letter;
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
        }
    }
    private char getNextLetter() {
        if (lastLetter == 'C') {
            return 'A';
        } else if (lastLetter == 'A') {
            return 'B';
        } else {
            return 'C';
        }
    }

    private static class Printer {
        public void print(char letter) {
            System.out.print(letter);
        }
    }
}


