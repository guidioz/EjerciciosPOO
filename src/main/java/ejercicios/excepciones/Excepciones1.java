package main.java.ejercicios.excepciones;

public class Excepciones1 {
    public static void main(String[] args) {
        int dividendo = 3, divisor = 0;
        try {
            int resultadoDivision = dividendo / divisor;
            System.out.println("El resultado de la division es: "+ resultadoDivision);
        }catch (ArithmeticException e){
            System.out.println("ERROR: No se puede dividir entre 0");
        }finally {
            System.out.println("Programa finalizado");
        }

    }
}
