package main.java.ejercicios.excepciones;

import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class Excepciones2 {
    public static void main(String[] args) {
        String numeroACalcularCuadrado = "hola";
        calcularCuadrado(numeroACalcularCuadrado);
    }
    private static void calcularCuadrado(String numero){
        try {
            Integer numeroCuadrado = Integer.parseInt(numero);
            System.out.println("El cuadrado de " + numero + " es: " + numeroCuadrado * numeroCuadrado);
        }catch(NumberFormatException e) {
            System.out.println("ERROR: No se puede convertir \"" + numero + "\" a un numero");
        }finally {
            System.out.println("El programa ha finalizado");
        }
    }
}
