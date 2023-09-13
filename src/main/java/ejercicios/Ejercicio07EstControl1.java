package main.java.ejercicios;

public class Ejercicio07EstControl1 {
    public static void main(String[] args) {
        /*Sintaxis de if()
         * dentro del paréntesis se pone la condición a evaluar
         * a continuación, entre llaves, el código que se ejecutaría si la condición se cumple.
         * Si la condición NO SE CUMPLE, entonces, no entra en el if*/
//        if(3 < 5) {
//            System.out.println("El número 3 es menor que 5");
//        }


        /*Sintaxis de if-else
         * En el else se pone el código que se ejecutaría cuando la condición del if no se cumple.
         * El código dentro de else va entre llaves*/
//        if(3 > 5) {
//            System.out.println("El número 3 es mayor que 5");
//        } else {
//            System.out.println("El número 3 es menor que 5");
//        }



        /*Sintaxis de for
         * El bucle for consta de 3 partes:
         * Una expresión de inicialización (se ejecuta al principio, asignando a la variable de control un valor inicial)
         * Una expresión de condición que hará que el bucle se mantenga mientras que se cumpla
         * Una expresión de incremento/decremento sobre la variable de control para conseguir la finalización del bucle
         * El código que se repetirá en cada iteración será el que vaya entre llaves*/
        /*for(int i = 0 ; i < 5 ; i++) {
            System.out.println("La variable i todavía es menor que 5, porque i vale " + i);
        }*/

        //        //Bucle while
//        int variableAEvaluar = 1;
//        while(variableAEvaluar < 5) {
//            System.out.println("La variable a evaluar todavía es menor que 5, porque vale " + variableAEvaluar);
//            variableAEvaluar++;
//        }



        //Bucle do-while
        int variableAEvaluar = 1;
        do {
            System.out.println("La variable a evaluar vale " + variableAEvaluar);
            variableAEvaluar++;
        } while(variableAEvaluar > 5);

    }//main()
}
