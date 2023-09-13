package main.java.ejercicios.ejercicionuevo;

import java.util.HashMap;
import java.util.Map;

public class Customer {
    private String name;
    private int weight;
    private int age;
    private String gender;
    private Map<Days, Diet> dietByDay;

    public Customer(String name, int weight, int age, String gender) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.dietByDay = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setDietForDay(Days day, Diet diet) {
        dietByDay.put(day, diet);
    }

    public Diet getDietForDay(Days day) {
        return dietByDay.get(day);
    }
}


