package main.java.ejercicios;

/*Ejercicio 2*/
//Mostrar por pantalla, usando for, la suma de los 5 primeros números (del 1 al 5)
public class Ejercicio10SumaConFor {

    public static void main(String[] args) {
        int suma = 0;
        for(int i = 1 ;i <=5 ; i++){
        suma = suma + i;
    }
        System.out.println("La suma de los 5 primeros valores es igual a " + suma);
    }

}
