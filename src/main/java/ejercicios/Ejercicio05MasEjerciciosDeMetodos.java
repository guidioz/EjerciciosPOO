package main.java.ejercicios;

public class Ejercicio05MasEjerciciosDeMetodos {
    public static void main(String[] args) {
            //Variable e invocación del primer ejercicio calcularCuadrado
            int numeroParaCalcularCuadrado = 5;
            calcularCuadrado(numeroParaCalcularCuadrado);


            //Variables e invoación del segundo ejercicio calcularPorcentaje
            int primerNumero = 5;
            int segundoNumero = 90;
            calcularPorcentaje(primerNumero, segundoNumero);

            //Variables e invocación del tercer ejercicio calcularAreaCuadrado
            int ladoDelCuadrado = 3;
            //System.out.println("El área de un cuadrado de lado " + ladoDelCuadrado + " es " + calcularAreaCuadrado(ladoDelCuadrado));
            int resultadoArea = calcularAreaCuadrado(ladoDelCuadrado);
            System.out.println("El área de un cuadrado de lado " + ladoDelCuadrado + " es " + resultadoArea);
    }//main


    /* Ejercicio 1) Crear un método que reciba por parámetro un número entero
     * y muestre por pantalla su cuadrado.
     * */
    public static void calcularCuadrado(int numero) {
        int resultadoFinalDelCuadrado = numero * numero;
        System.out.println("El cuadrado de " + numero + " es igual a: " + resultadoFinalDelCuadrado);
    }//fin calcularCuadrado


    /* Ejercicio 2) Crear un método que reciba por parámetro dos enteros: a y b, y calcule "el a por ciento
     * de b", y lo muestre por pantalla. Por ejemplo: a= 5, b= 90 --> Calcula el 5 por ciento de 90.*/
    public static void calcularPorcentaje(int primerNumero, int segundoNumero) {

        //System.out.println("El " + primerNumero + "% de " + segundoNumero + " es " + (primerNumero * segundoNumero)/100);

        double resultadoDelPorcentaje = (double) (primerNumero * segundoNumero)/100;
        System.out.println("El " + primerNumero + "% de " + segundoNumero + " es " + resultadoDelPorcentaje);
    }//calcularPorcentaje

    public static int calcularAreaCuadrado(int lado) {
        int areaDelCuadrado = lado * lado;
        return areaDelCuadrado;
    }//fin calcularAreaCuadrado()
}
