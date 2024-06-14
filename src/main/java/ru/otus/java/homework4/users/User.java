package ru.otus.java.homework4.users;


public class User {
    private String surname;
    private String name;
    private String patronymic;
    private int yearBirth;
    private String email;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(String surname, String name, String patronymic, int yearBirth, String email) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.yearBirth = yearBirth;
        this.email = email;
    }
    public void info() {
        System.out.println(surname + " " + name + " " + patronymic+ " " + yearBirth+ " " + email);
    }

    @Override
    public String toString() {
        return "ФИО: " + this.surname + " " + this.name + " " + this.patronymic + " " + "Год рождения:" + this.yearBirth + " "+ "e-mail:" + this.email;
    }
}
