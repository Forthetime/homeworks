package ru.otus.java.homework11;

import java.util.Arrays;

public class MainApplication11 {
    public static void main(String[] args) {
        PersonDataBase personDataBase = new PersonDataBase();
        Person p1 = new Person("Eremin", Position.MANAGER, 1L);
        Person p2 = new Person("Antonov", Position.PLUMBER, 2L);
        Person p3 = new Person("Panfilov", Position.DEVELOPER, 3L);
        personDataBase.add(p1);
        personDataBase.add(p2);
        personDataBase.add(p3);
        System.out.println(personDataBase);
        personDataBase.findById(2L);
        System.out.println(p1.getPosition());
        personDataBase.isManager(p1);
        personDataBase.isEmployee(1L);
    }
}

