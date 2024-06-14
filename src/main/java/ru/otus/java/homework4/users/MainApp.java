package ru.otus.java.homework4.users;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        User[] users = {
                new User("Иванов", "Иван", "Петрович", 1980, "test1@mail.ru"),
                new User("Тестовый", "Геннадий ", "Степанович", 1987, "sale@mail.ru"),
                new User("Петров", "Иван ", "Фурсович", 1957, "sale1@mail.ru"),
                new User("Гаечкин", "Петр ", "Петрович", 1975, "sale2@mail.ru"),
                new User("Сидоров", "Иван ", "Сидорович", 2007, "sale3@mail.ru"),
                new User("Алексеев", "Павел ", "Павлович", 1937, "sale4@mail.ru"),
                new User("Воронова", "Галина ", "Сергеевна", 1999, "sale5@mail.ru"),
                new User("Вишванюк", "Владимир ", "Владимирович", 1996, "sale6@mail.ru"),
                new User("Хальзова", "Елена ", "Степановна", 2001, "sale7@mail.ru"),
                new User("Курышева", "Тамара ", "Игоревна", 1965, "sale8@mail.ru"),
        };
        System.out.println(Arrays.toString(users));

        for (int i = 0; i < users.length; i++) {
            if ((2024 - users[i].getYearBirth())>40) {
                users[i].info();
            }
        }
    }
}
