package main.java.ejercicios.ejercicionuevo;

public class Food {
    private double carbs;
    private double proteins;
    private double fats;
    private String name;
    private double grams; // Nuevo atributo

    public Food(double carbs, double proteins, double fats, String name, double grams) {
        this.carbs = carbs;
        this.proteins = proteins;
        this.fats = fats;
        this.name = name;
        this.grams = grams; // Inicializamos la cantidad en gramos
    }

    public String getName() {
        return name;
    }

    public double getCarbs() {
        return carbs;
    }

    public double getProteins() {
        return proteins;
    }

    public double getFats() {
        return fats;
    }

    public double getCalories() {
        // Suponiendo que cada gramo de carbohidratos y proteínas aporta 4 calorías,
        // y que cada gramo de grasa aporta 9 calorías.
        double caloriesFromCarbs = carbs * 4;
        double caloriesFromProteins = proteins * 4;
        double caloriesFromFats = fats * 9;

        // Sumar las calorías de los macronutrientes para obtener el total.
        return caloriesFromCarbs + caloriesFromProteins + caloriesFromFats;
    }

    public double getGrams() {
        return grams; // Método para obtener la cantidad en gramos
    }
}
