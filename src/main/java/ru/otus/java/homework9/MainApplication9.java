package ru.otus.java.homework9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApplication9 {
    public static void main(String[] args) {
        sequenceFromMinToMax(33, 44);
        sumNumbers(Arrays.asList(1, 2, 23, 44, 5));
        fillArrayListWitnN(5, Arrays.asList(8, 2, 23, 44, 5));
        increaseArrayList(2, Arrays.asList(1, 3, 5, 100));

        Employee e0 = new Employee("Volkov Denis", 18);
        Employee e1 = new Employee("Elizarova Svetlana", 50);
        Employee e2 = new Employee("Karpov Anton", 22);
        Employee e3 = new Employee("Primerov Pavel", 18);

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(e0);
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        getNameEmployees(employees);
        getEmployeesElderThanMinAge(19, employees);
        checkEmployeesAverageAge(18, employees);
        findTheYoungestEmploee(employees);
    }

    private static void sequenceFromMinToMax(int min, int max) {
        List<Integer> list = new ArrayList<>();
        for (int i = min; i < max + 1; i++) {
            list.add(i);
        }
        System.out.println(list);
    }

    private static int sumNumbers(List<Integer> list2) {
        int sum = 0;
        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i) > 5) {
                sum += list2.get(i);
            }
        }
        System.out.println(sum);
        return sum;
    }

    private static void fillArrayListWitnN(int n, List<Integer> list3) {
        for (int i = 0; i < list3.size(); i++) {
            list3.set(i, n);
        }
        System.out.println(list3);
    }

    private static void increaseArrayList(int increase, List<Integer> list4) {
        for (int i = 0; i < list4.size(); i++) {
            list4.set(i, list4.get(i) + increase);
        }
        System.out.println(list4);
    }


    private static void getNameEmployees(List<Employee> employees) {
        List<String> employeeNames = new ArrayList<>();
        for (Employee name : employees) {
            employeeNames.add(name.getName());
        }
        System.out.println(employeeNames);
    }

    private static void getEmployeesElderThanMinAge(int minAge, List<Employee> employees) {
        List<Employee> EmployeesElderThanMinAge = new ArrayList<>();
        for (Employee age : employees) {
            if (age.getAge() >= minAge) {
                EmployeesElderThanMinAge.add(age);
            }
        }
        System.out.println(EmployeesElderThanMinAge);
    }

    private static boolean checkEmployeesAverageAge(int minAvarageAge, List<Employee> employees) {
        int avarageAgeEmployee;
        int sumAge = 0;
        for (Employee age : employees) {
            sumAge += age.getAge();
        }
        avarageAgeEmployee = sumAge / employees.size();
        if (avarageAgeEmployee > minAvarageAge) {
            System.out.println(true);
        }
        return true;
    }

    private static void findTheYoungestEmploee(List<Employee> employees) {
        List<Employee> TheYoungestEmploees = new ArrayList<>();
        int minAge = 100;
        for (Employee age : employees) {
            if (age.getAge() <= minAge) {
                minAge = age.getAge();
                TheYoungestEmploees.add(age);
            }
        }
        System.out.println(TheYoungestEmploees);
    }
}