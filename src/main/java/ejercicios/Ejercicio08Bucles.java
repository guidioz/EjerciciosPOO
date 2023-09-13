package main.java.ejercicios;

public class Ejercicio08Bucles {
    public static void main(String[] args) {

        // Ejercicio 1) Mostrar por pantalla los 30 primeros números pares

        //Con 'for'
        System.out.println("Lista de los 30 primeros números pares");
        for(int i = 0; i < 30; i++) {
            System.out.println(i*2);
        }

        //Con 'while'
        int numeroAEvaluar = 0;
        int contadorNumerosPares = 0;

        System.out.println("Lista de los 30 primeros números pares");

        while(contadorNumerosPares < 30) {
            if(numeroAEvaluar % 2 == 0) {
                System.out.println(numeroAEvaluar);
                contadorNumerosPares++;
            }
            numeroAEvaluar++;
        }

    }

}
