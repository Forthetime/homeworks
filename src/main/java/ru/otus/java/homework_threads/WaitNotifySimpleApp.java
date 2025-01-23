package ru.otus.java.homework_threads;

public class WaitNotifySimpleApp {

    private final Object mon = new Object(); // Монитор для синхронизации

    private Printer printer = new Printer();

    public static void main(String[] args) {
        WaitNotifySimpleApp waitNotifyApp = new WaitNotifySimpleApp();
        new Thread(() -> waitNotifyApp.printLettterA()).start();
        new Thread(() -> waitNotifyApp.printLettterB()).start();
        new Thread(() -> waitNotifyApp.printLettterC()).start();
    }

    public void printLettterA() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (!printer.isLastLetterC()) {
                        mon.wait();
                    }
                    printer.printA();
                    printer.setLastLetter("A");
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printLettterB() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (!printer.isLastLetterA()) {
                        mon.wait();
                    }
                    printer.printB();
                    printer.setLastLetter("B");
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printLettterC() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (!printer.isLastLetterB()) {
                        mon.wait();
                    }
                    printer.printC();
                    printer.setLastLetter("C");
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private class Printer {
        private String lastLetter = "C";

        public void printA() {
            System.out.print("A");
        }

        public void printB() {
            System.out.print("B");
        }

        public void printC() {
            System.out.print("C");
        }

        boolean isLastLetterA() {
            return "A".equals(lastLetter);
        }

        boolean isLastLetterB() {
            return "B".equals(lastLetter);
        }

        boolean isLastLetterC() {
            return "C".equals(lastLetter);
        }

        public void setLastLetter(String lastLetter) {
            this.lastLetter = lastLetter;
        }
    }
}




