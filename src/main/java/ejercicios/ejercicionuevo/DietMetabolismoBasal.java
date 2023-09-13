package main.java.ejercicios.ejercicionuevo;

public class DietMetabolismoBasal extends Diet {
    private boolean isWoman;
    private int age;
    private int height;
    private int weight;

    public DietMetabolismoBasal(String name, boolean isWoman, int age, int height, int weight) {
        super(name);
        this.isWoman = isWoman;
        this.age = age;
        this.height = height;
        this.weight = weight;
        calcularMetabolismoBasal();
    }

    // En la clase DietMetabolismoBasal
    private void calcularMetabolismoBasal() {
        // Obtener el valor de maxCalories usando el método de la clase Diet
        int maxCalories = obtenerMaxCalorias();

        if (isWoman) {
            maxCalories = (int) (10 * weight + 6.25 * height - 5 * age - 161);
        } else {
            maxCalories = (int) (10 * weight + 6.25 * height - 5 * age + 5);
        }
    }


    public void setMaxCalories(int maxCalories) {
        this.maxCalories = maxCalories;
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
}
