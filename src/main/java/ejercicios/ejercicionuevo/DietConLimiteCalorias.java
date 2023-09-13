package main.java.ejercicios.ejercicionuevo;

public class DietConLimiteCalorias extends Diet {
    private int maxCalories;

    public DietConLimiteCalorias(String name, int maxCalories) {
        super(name);
        this.maxCalories = maxCalories;
    }

    public int getMaxCalories() {
        return maxCalories;
    }
}
