package _04_PizzaCalories;

import java.util.List;

public class Pizza {
//name: String
//dought:  Dough
//toppings: List<Topping>

    private String name;
    private Dough dough;
    private List<Topping> toppings;
    private int numberOfToppings;


    public Pizza(String name, int numberOfToppings) {
        setName(name);
        setToppings(numberOfToppings);
        this.numberOfToppings = numberOfToppings;
    }

    private void setToppings(int numberOfToppings) {
        // -	setToppings(int) : void
    }
    private void setName(String name) {
        // -	setName(String) : void
        this.name = name;

    }
    public void setDough(Dough dough) {
        // +	setDough(Dough) : void
        this.dough = dough;
    }

    public String getName() {
        // +	getName(): String
        return name;
    }

    // +	addTopping (Topping) : void

    public void addTopping
}
