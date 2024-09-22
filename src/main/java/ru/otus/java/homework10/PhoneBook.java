package ru.otus.java.homework10;

import java.util.*;

public class PhoneBook {
    Map<String, List<String>> namesAndPhones = new HashMap<>();

    @Override
    public String toString() {
        return "PhoneBook{" +
                "namesAndPhones=" + namesAndPhones +
                '}';
    }

    public Map<String, List<String>> add(String name, String phone) {
        if (namesAndPhones.containsKey(name)) {
            namesAndPhones.get(name).add(phone);
        } else {
            ArrayList<String> listOfPones = new ArrayList<>();
            listOfPones.add(phone);
            namesAndPhones.put(name, listOfPones);
        }
        System.out.println(namesAndPhones);
        return namesAndPhones;
    }

    public List<String> find(String name) {
        List<String> phones = namesAndPhones.get(name);
        if (phones != null) {
            System.out.println(phones);
            return phones;
        } else {
            System.out.println("Имя " + name + " не найдено");
            return Collections.emptyList();
        }
    }

    public void containsPhoneNumber(String phone) {
        boolean notContainsPhoneNumber = true;
        for (List<String> listOfPhones : namesAndPhones.values()) {
            if (listOfPhones.contains(phone)) {
                notContainsPhoneNumber = false;
                System.out.println("Телефон " + phone + " есть в справочнике");
                break;
            }
        }
        if (notContainsPhoneNumber) {
            System.out.println("Телефона " + phone + " нет в справочнике");
        }
    }
}

