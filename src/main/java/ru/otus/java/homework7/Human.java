package ru.otus.java.homework7;


public class Human {
    private String name;
    private Transport transport;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", transport=" + transport +
                '}';
    }

    public boolean getIn(Transport transport) {
        if (this.transport == null) {
            this.transport = transport; // присвоить  вид транспорта
            System.out.println(name + " сел в транспорт " + transport.getName());
            return true;
        }
        System.out.println(name + " едет в другом транспорте");
        return false;
    }

    public void getOff() {
        if (this.transport == null) {
            System.out.println(name + " итак не на транспорте");
        }
        this.transport = null;
        System.out.println(name + " вышел из транспорта");
    }

    public boolean move(int distance, Area area) {
        if (this.transport == null) {
            System.out.println("Человек не на транспорте, прошел пешком " + distance + " км");
            return false;
        }
        transport.drive(distance, area);
        return true;
    }
}



