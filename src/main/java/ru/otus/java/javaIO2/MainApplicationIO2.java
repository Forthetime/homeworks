package ru.otus.java.javaIO2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class MainApplicationIO2 {
    public static void main(String[] args) throws IOException {
        findingSymbols();
    }

    private static void findingSymbols() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите имя файла, с которым будете работать");
        String chosenFile = scanner.nextLine();
        String text = chosenFile.toString();
        FileReader filereader = new FileReader(text);
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(chosenFile, StandardCharsets.UTF_8))) {
            String line;
            System.out.print("\nВведите последовательность, которую Вы хотите найти\n");
            String chosenLine = scanner.nextLine();
            int wordCount = 0;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split(chosenLine);
                wordCount += words.length - 1;
            }
            bufferedReader.close();
            System.out.println("Количество" + wordCount);
        }
    }
}


