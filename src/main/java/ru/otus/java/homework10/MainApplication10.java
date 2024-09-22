package ru.otus.java.homework10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MainApplication10 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов Петр Петрович", "89277122111");
        phoneBook.add("Иванов Петр Петрович", "89277122112");
        phoneBook.add("Сидоров Иван Иванович", "89277122113");
        phoneBook.find("Сидоров Иван Иванович");
        System.out.println(Arrays.asList(phoneBook.toString()));
        phoneBook.containsPhoneNumber("89277122114");
    }
}
