package Encapsulation._03_ValidationData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        ArrayList<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] inputData = br.readLine().split("\\s+");
            String firstName = inputData[0];
            String lastName = inputData[1];
            int age = Integer.parseInt(inputData[2]);
            double salary = Double.parseDouble(inputData[3]);
            Person current;
            try {
                current = new Person(firstName, lastName, age, salary);
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
                continue;
            }
            people.add(current);
        }

        double bonus = Double.parseDouble(br.readLine());

        for (Person person : people) {
            person.increaseSalary(bonus);
            System.out.println(person.toString());

        }
    }
}
