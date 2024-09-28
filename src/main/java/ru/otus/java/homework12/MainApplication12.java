package ru.otus.java.homework12;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class MainApplication12 {
    public static void main(String[] args) {

        File file = new File("D:\\Ира\\Java\\Идея\\homeworks");
        for (File f : file.listFiles()) {
            if (f.getName().endsWith("txt")) {
                System.out.println(f.getName());
            }
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите имя файла, с которым будете работать");
        String chosenFile = scanner.nextLine();

        try (InputStreamReader in = new InputStreamReader(new FileInputStream(chosenFile))) {
            int n = in.read();
            while (n != -1) {
                System.out.print((char) n);
                n = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print("\nВведите строку, которую Вы хотетите добавить в файл\n");
        String chosenLine = scanner.nextLine();
        try {
            Files.write(Paths.get(chosenFile), chosenLine.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

