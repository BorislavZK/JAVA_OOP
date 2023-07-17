package Encapsulation._02_Salary_Increase;

import java.text.DecimalFormat;

public class Person {

    private final String firstName;
    private final String lastName;
    private final int age;

    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.setSalary(salary);

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        //Angel Ivanov gets 2640.0 leva

        String df = new DecimalFormat("#.0##").format(this.getSalary());
        return String.format("%s %s gets %s leva", this.firstName, this.lastName, df);
    }

    public void increaseSalary(double bonus) {

        int ageFactor = 100;
        if (this.age < 30) {
            ageFactor = 200;
        }
        salary *= (1 + bonus / ageFactor);

    }
}
