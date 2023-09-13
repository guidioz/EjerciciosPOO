package main.java.ejercicios.ejercicionuevo;

public class DietConLimiteMacronutrientes extends Diet {
    private double maxFats;
    private double maxCarbs;
    private double maxProteins;

    public DietConLimiteMacronutrientes(String name, double maxFats, double maxCarbs, double maxProteins) {
        super(name);
        this.maxFats = maxFats;
        this.maxCarbs = maxCarbs;
        this.maxProteins = maxProteins;
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
}
