package main.java.ejercicios.ejercicionuevo;

import java.util.ArrayList;
import java.util.List;

public class Diet {
    private String name;
    private List<Food> foods;
    int maxCalories;
    private double maxFats;
    private double maxCarbs;
    private double maxProteins;
    private boolean isWoman;
    private int age;
    private int height;
    private int weight;
    private DietType dietType;
    protected int obtenerMaxCalorias() {
        return maxCalories;
    }

    public Diet(String name) {
        this.name = name;
        this.foods = new ArrayList<>();
        this.dietType = DietType.SIN_LIMITE;
    }

    public enum DietType {
        SIN_LIMITE,
        CON_LIMITE_CALORIAS,
        CON_LIMITE_MACRONUTRIENTES,
        METABOLISMO_BASAL
    }

    public static Diet crearDietaSinLimite(String name) {
        Diet diet = new Diet(name);
        diet.setDietType(DietType.SIN_LIMITE);
        return diet;
    }

    public static Diet crearDietaConLimiteCalorias(String name, int maxCalories) {
        Diet diet = new Diet(name);
        diet.setDietType(DietType.CON_LIMITE_CALORIAS);
        diet.maxCalories = maxCalories;
        return diet;
    }

    public static Diet crearDietaConLimiteMacronutrientes(String name, double maxFats, double maxCarbs, double maxProteins) {
        Diet diet = new Diet(name);
        diet.setDietType(DietType.CON_LIMITE_MACRONUTRIENTES);
        diet.maxFats = maxFats;
        diet.maxCarbs = maxCarbs;
        diet.maxProteins = maxProteins;
        return diet;
    }

    public static Diet crearDietaMetabolismoBasal(String name, boolean isWoman, int age, int height, int weight) {
        Diet diet = new Diet(name);
        diet.setDietType(DietType.METABOLISMO_BASAL);
        diet.isWoman = isWoman;
        diet.age = age;
        diet.height = height;
        diet.weight = weight;
        diet.calcularMetabolismoBasal();
        return diet;
    }

    public static Diet dietaPredeterminadaSinLimite() {
        Diet dieta = new Diet("Dieta Sin Límite");
        dieta.setDietType(DietType.SIN_LIMITE);
        dieta.addFood(new Food(100.0, 20.0, 10.0, "Arroz", 100.0)); // Agrega la cantidad en gramos
        dieta.addFood(new Food(80.0, 10.0, 5.0, "Pollo", 100.0));  // Agrega la cantidad en gramos
        return dieta;
    }

    public static Diet dietaPredeterminadaConLimiteCalorias() {
        Diet dieta = new Diet("Dieta con Límite de Calorías");
        dieta.setDietType(DietType.CON_LIMITE_CALORIAS);
        dieta.addFood(new Food(50.0, 10.0, 5.0, "Ensalada", 100.0)); // Agrega la cantidad en gramos
        dieta.addFood(new Food(100.0, 20.0, 10.0, "Salmón", 100.0)); // Agrega la cantidad en gramos
        dieta.maxCalories = 2000;
        return dieta;
    }

    public static Diet dietaPredeterminadaConLimiteMacronutrientes() {
        Diet dieta = new Diet("Dieta con Límite de Macronutrientes");
        dieta.setDietType(DietType.CON_LIMITE_MACRONUTRIENTES);
        dieta.addFood(new Food(30.0, 10.0, 5.0, "Verduras", 100.0)); // Agrega la cantidad en gramos
        dieta.addFood(new Food(80.0, 20.0, 10.0, "Tofu", 100.0));     // Agrega la cantidad en gramos
        dieta.maxFats = 50.0;
        dieta.maxCarbs = 200.0;
        dieta.maxProteins = 100.0;
        return dieta;
    }

    public static Diet dietaPredeterminadaMetabolismoBasal() {
        Diet dieta = new Diet("Dieta de Metabolismo Basal");
        dieta.setDietType(DietType.METABOLISMO_BASAL);
        dieta.addFood(new Food(60.0, 15.0, 8.0, "Avena", 100.0));    // Agrega la cantidad en gramos
        dieta.addFood(new Food(90.0, 20.0, 12.0, "Huevos", 100.0));  // Agrega la cantidad en gramos
        dieta.isWoman = true;
        dieta.age = 30;
        dieta.height = 160;
        dieta.weight = 60;
        dieta.calcularMetabolismoBasal();
        return dieta;
    }

    private void calcularMetabolismoBasal() {
        if (isWoman) {
            maxCalories = (int) (10 * weight + 6.25 * height - 5 * age - 161);
        } else {
            maxCalories = (int) (10 * weight + 6.25 * height - 5 * age + 5);
        }
    }

    public String getName() {
        return name;
    }

    public void addFood(Food food) {
        foods.add(food);
    }

    public List<Food> getFood() {
        return foods;
    }

    public int getMaxCalories() {
        return maxCalories;
    }

    public double getMaxFats() {
        return maxFats;
    }

    public double getMaxCarbs() {
        return maxCarbs;
    }

    public double getMaxProteins() {
        return maxProteins;
    }

    public boolean isWoman() {
        return isWoman;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public DietType getDietType() {
        return dietType;
    }

    public void setDietType(DietType dietType) {
        this.dietType = dietType;
    }
}

