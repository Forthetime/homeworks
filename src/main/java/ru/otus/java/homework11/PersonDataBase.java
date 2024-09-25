package ru.otus.java.homework11;

import java.util.*;

import static ru.otus.java.homework11.Position.*;

public class PersonDataBase {

    HashSet<Person> peopleList = new HashSet<>();

    @Override
    public String toString() {
        return "PersonDataBase{" +
                "peopleList=" + peopleList +
                '}';
    }

    public void add(Person person) {
        peopleList.add(person);
    }

    public Person findById(Long id) {
        Person searchingPerson = null;
        for (Person person : peopleList) {
            if (person.getId() == id) {
                searchingPerson = person;
                System.out.println(searchingPerson);
            }
        }
        return searchingPerson;
    }

    public boolean isManager(Person person) {
        if (person.getPosition() == MANAGER ||
                person.getPosition() == DIRECTOR ||
                person.getPosition() == BRANCH_DIRECTOR ||
                person.getPosition() == SENIOR_MANAGER
        ) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    public boolean isEmployee(Long id) {
        Person searchingPerson = null;
        for (Person person : peopleList) {
            if (person.getId() == id) {
                searchingPerson = person;
            }
        }
        if (searchingPerson.getPosition() == MANAGER ||
                searchingPerson.getPosition() == DIRECTOR ||
                searchingPerson.getPosition() == BRANCH_DIRECTOR ||
                searchingPerson.getPosition() == SENIOR_MANAGER) {
            System.out.println("false");
            return false;
        } else {
            System.out.println("true");
            return true;
        }
    }
}
