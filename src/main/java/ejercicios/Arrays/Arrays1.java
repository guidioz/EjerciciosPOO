package main.java.ejercicios.Arrays;

public class Arrays1 {

    public static void main(String[] args) {

        //Declarar un array
        String[] ejemploArray1;

        //Inicializar un Array declarado anteriormente
        ejemploArray1 = new String[4];

        //Establecer los datos
        ejemploArray1[0]="A";
        ejemploArray1[1]="B";
        ejemploArray1[2]="C";
        ejemploArray1[3]="D";

        //Declarar e inicializar un Array, con 5 posiciones
        String[] ejemploArray2 = new String[5];

        //Declarar e inicializar un Array tipo float
        float[][] arrayDeDosDimensiones;

        //Declarar e inicializar asignando todos sus valores
        int[] ejemploArray3 ={1,2,3,4,5};

        //Obtener el valor  de un indice, en concreto el indice 0 del ejemploArray3
        System.out.println("El indice 0 del ejemploArray3 es " + ejemploArray3[0]);

        //Obtener longitud de ejemploArray3 (5)
        System.out.println("La longitud del ejemploArray3 es " + ejemploArray3.length);

        //Obtener todos los valores de menor indice al mayor
        for (int i =0; i < ejemploArray1.length; i++){
            System.out.println("El ejemploArray1 en el indice " + i + " toma elvalor " + ejemploArray1[i]);
        }

        //Obtener todos los valores de mayor indice al menor
        for(int i=ejemploArray1.length -1; i>=0;i--){
            System.out.println("El ejemploArray1 en el indice " + i + " toma elvalor " + ejemploArray1[i]);
        }
    }

}