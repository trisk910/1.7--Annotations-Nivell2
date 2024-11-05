package org.example.Level1.Bussiness;

public class Worker {
    private String name;
    private String surname;
    private double pricePerHour;

    public Worker(String name, String surname, double pricePerHour) {
        this.name = name;
        this.surname = surname;
        this.pricePerHour = pricePerHour;
    }

    public double calculateSalary(float hours) {
        return pricePerHour * hours;
    }

    @Override
    public String toString() {
        return "name: " + name + ", surname: " + surname + ", price per hour: " + pricePerHour;
    }
}
