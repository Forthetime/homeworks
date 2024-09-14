package ru.otus.java.homework10;

import java.util.*;

public class PhoneBook {
    Map<String, ArrayList<String>> namesAndPhones = new HashMap<>();

    @Override
    public String toString() {
        return "PhoneBook{" +
                "namesAndPhones=" + namesAndPhones +
                '}';
    }

    public Map<String, ArrayList<String>> add(String name, String phone) {
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

    public Map<String, ArrayList<String>> find(String name) {
        if (namesAndPhones.containsKey(name)) {
            namesAndPhones.get(name);
            System.out.println(namesAndPhones.get(name));
        } else {
            System.out.println("name " + "не найдено");
        }
        return namesAndPhones;
    }

    public void containsPhoneNumber(String phone) {
        boolean notContainsPhoneNumber = true;
        for (ArrayList<String> listOfPhones : namesAndPhones.values()) {
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

