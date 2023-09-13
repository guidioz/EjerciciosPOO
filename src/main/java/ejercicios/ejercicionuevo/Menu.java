package main.java.ejercicios.ejercicionuevo;

import java.util.List;
import java.util.Scanner;



public class Menu {
    public static void main(String[] args) {
        mostrarMenu();
    }

    public static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        Diet diet = null;

        while (true) {
            System.out.println("Menú Principal:");
            System.out.println("1. Crear/Reiniciar Dieta");
            System.out.println("2. Mostrar Información de la Dieta");
            System.out.println("3. Agregar Alimento a la Dieta");
            System.out.println("4. Seleccionar Dieta Predeterminada");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    diet = crearOReiniciarDieta(scanner, diet);
                    break;
                case 2:
                    mostrarInformacionDieta(diet);
                    break;
                case 3:
                    agregarAlimento(scanner, diet);
                    break;
                case 4:
                    diet = seleccionarDietaPredeterminada(scanner);
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
    }

    private static Diet crearOReiniciarDieta(Scanner scanner, Diet diet) {
        System.out.println("Seleccione el tipo de dieta:");
        System.out.println("1. Sin Límite");
        System.out.println("2. Límite de Calorías");
        System.out.println("3. Límite de Macronutrientes");
        System.out.println("4. Metabolismo Basal");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                diet = Diet.crearDietaSinLimite("Nueva Dieta Sin Límite");
                break;
            case 2:
                System.out.print("Ingrese el límite de calorías: ");
                int maxCalorias = scanner.nextInt();
                diet = Diet.crearDietaConLimiteCalorias("Nueva Dieta con Límite de Calorías", maxCalorias);
                break;
            case 3:
                System.out.print("Ingrese el límite de grasas: ");
                double maxFats = scanner.nextDouble();
                System.out.print("Ingrese el límite de carbohidratos: ");
                double maxCarbs = scanner.nextDouble();
                System.out.print("Ingrese el límite de proteínas: ");
                double maxProteins = scanner.nextDouble();
                diet = Diet.crearDietaConLimiteMacronutrientes("Nueva Dieta con Límite de Macronutrientes", maxFats, maxCarbs, maxProteins);
                break;
            case 4:
                System.out.print("¿Es una mujer? (true/false): ");
                boolean isWoman = scanner.nextBoolean();
                System.out.print("Ingrese la edad: ");
                int age = scanner.nextInt();
                System.out.print("Ingrese la altura en cm: ");
                int height = scanner.nextInt();
                System.out.print("Ingrese el peso en kg: ");
                int weight = scanner.nextInt();
                diet = Diet.crearDietaMetabolismoBasal("Nueva Dieta de Metabolismo Basal", isWoman, age, height, weight);
                break;
            default:
                System.out.println("Opción no válida. Creando una dieta sin límite.");
                diet = Diet.crearDietaSinLimite("Nueva Dieta Sin Límite");
                break;
        }

        return diet;
    }

    private static Diet seleccionarDietaPredeterminada(Scanner scanner) {
        System.out.println("Seleccione una Dieta Predeterminada:");
        System.out.println("1. Dieta Sin Límite");
        System.out.println("2. Dieta con Límite de Calorías");
        System.out.println("3. Dieta con Límite de Macronutrientes");
        System.out.println("4. Dieta de Metabolismo Basal");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                return Diet.dietaPredeterminadaSinLimite();
            case 2:
                return Diet.dietaPredeterminadaConLimiteCalorias();
            case 3:
                return Diet.dietaPredeterminadaConLimiteMacronutrientes();
            case 4:
                return Diet.dietaPredeterminadaMetabolismoBasal();
            default:
                System.out.println("Opción no válida. Volviendo al menú principal.");
                return null;
        }
    }

    private static void mostrarInformacionDieta(Diet diet) {
        if (diet != null) {
            System.out.println("Información de la dieta '" + diet.getName() + "':");

            // Mostrar el tipo de límite de la dieta
            System.out.print("Tipo de límite: ");
            switch (diet.getDietType()) {
                case SIN_LIMITE:
                    System.out.println("Sin límite específico");
                    break;
                case CON_LIMITE_CALORIAS:
                    System.out.println("Límite de calorías");
                    System.out.println("Calorías máximas permitidas: " + diet.getMaxCalories());
                    break;
                case CON_LIMITE_MACRONUTRIENTES:
                    System.out.println("Límite de macronutrientes");
                    System.out.println("Límite de grasas: " + diet.getMaxFats() + " gramos");
                    System.out.println("Límite de carbohidratos: " + diet.getMaxCarbs() + " gramos");
                    System.out.println("Límite de proteínas: " + diet.getMaxProteins() + " gramos");
                    break;
                case METABOLISMO_BASAL:
                    System.out.println("Metabolismo basal");
                    System.out.println("Es una mujer: " + diet.isWoman());
                    System.out.println("Edad: " + diet.getAge() + " años");
                    System.out.println("Altura: " + diet.getHeight() + " cm");
                    System.out.println("Peso: " + diet.getWeight() + " kg");
                    break;
            }

            // Mostrar información común a todas las dietas
            List<Food> alimentos = diet.getFood();
            if (alimentos != null && !alimentos.isEmpty()) {
                System.out.println("Alimentos agregados:");
                for (Food food : alimentos) {
                    System.out.println("Nombre: " + food.getName());
                    System.out.println("Cantidad en gramos: " + food.getGrams() + " gramos"); // Agregamos la cantidad en gramos
                    System.out.println("Carbohidratos: " + food.getCarbs() + " gramos");
                    System.out.println("Proteínas: " + food.getProteins() + " gramos");
                    System.out.println("Grasas: " + food.getFats() + " gramos");
                    System.out.println("Calorías: " + food.getCalories() + " kcal");
                    System.out.println("------------------------------------");
                }
            } else {
                System.out.println("No se han agregado alimentos a la dieta.");
            }
        } else {
            System.out.println("Primero debe crear una dieta.");
        }
    }




    private static void agregarAlimento(Scanner scanner, Diet diet) {
        if (diet != null) {
            System.out.print("Ingrese el nombre del alimento: ");
            String foodName = scanner.next();
            System.out.print("Ingrese la cantidad en gramos del alimento: ");
            double grams = scanner.nextDouble(); // Captura la cantidad en gramos
            System.out.print("Ingrese la cantidad de carbohidratos del alimento en gramos: ");
            double carbs = scanner.nextDouble();
            System.out.print("Ingrese la cantidad de proteínas del alimento en gramos: ");
            double proteins = scanner.nextDouble();
            System.out.print("Ingrese la cantidad de grasas del alimento en gramos: ");
            double fats = scanner.nextDouble();
            Food food = new Food(carbs, proteins, fats, foodName, grams); // Pasamos la cantidad en gramos
            diet.addFood(food);
            System.out.println("Alimento agregado a la dieta.");
        } else {
            System.out.println("Primero debe crear una dieta.");
        }
    }


}
