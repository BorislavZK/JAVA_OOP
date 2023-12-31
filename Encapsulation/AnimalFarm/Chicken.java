package Encapsulation.AnimalFarm;

public class Chicken {

    private String name;
    private int age;

    public Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }

    private void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }


    private void setAge(int age) {
        if (age < 0 || age > 15) {
            throw new IllegalStateException("Age should be between 0 and 15");
        }
        this.age = age;
    }

    public double productPerDay() {
        return calculateProductPerDay();
    }

    private double calculateProductPerDay() {
        if (age<6){
            return 2.0;
        } else if (age<12) {
            return 1.00;
        }else {
            return 0.75;
        }
    }

    @Override
    public String toString() {
        return String.format("%s Chichi (age %d) can produce %.2f eggs per day.",this.name,this.age, productPerDay());
    }
}
