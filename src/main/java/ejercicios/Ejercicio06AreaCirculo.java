package main.java.ejercicios;

public class Ejercicio06AreaCirculo {

    public static void main(String[] args) {
        float radioDelCirculo = 5;
        float areaDelCirculoo = calcularAreaCirculo(radioDelCirculo);
        System.out.println("El area del circulo de radio "+ radioDelCirculo +" es "+ areaDelCirculoo );
    }

    public static float calcularAreaCirculo(float radio){
        final float pi = (float)3.141593F;
        float areaDelCirculo = pi * radio * radio;
        return areaDelCirculo;
    }



}

/* Crear un método que calcule el área de un círculo.
 * El método recibirá por parámetro el valor del radio del círculo.
 * El área de un círculo se calcula multiplicando la constante PI por el cuadrado del radio del círculo.
 * Podeis usar la constante almacenada en Java "Math.PI" y almacenarla en una constante.
 * Podeis como opción alternativa crear una constante y asignarle el valor 3.141593.
 * Construid un mensaje concatenado para que se vea el resultado por pantalla.
 * Cread una clase dentro del paquete de ejercicios llamada Ejercicio06AreaCirculo.*/