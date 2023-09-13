package main.java.ejercicios.excepciones;

import java.util.ArrayList;
import java.util.List;

public class Excepciones5 {

    public static void main(String[] args) {
        List<Integer> listaNumerosEnteros = new ArrayList<>();
        for (int i=0;i<10;i++){
            listaNumerosEnteros.add(generarNumeroEntero());
        }
        try {
            comprobarNumeros(listaNumerosEnteros);
        }catch (NumberFiveException e){
            System.out.println("\"ERROR: El numero enviado es un 5. No es valido debido a su rima... \"");
        }finally {
            System.out.println("El programa ha finalizado");
        }


    }//main()
    private static int generarNumeroEntero(){
        return (int) Math.floor(Math.random() *10 +1);
    }
    private static void comprobarNumeros(List<Integer> listaNumeros) throws NumberFiveException{
        System.out.println("Los numeros generados son: [");
        for (Integer i: listaNumeros){
            System.out.println(i + " ");
            if (i==5){
                throw new NumberFiveException("ERROR: El numero enviado es un 5. No es valido debido a su rima... ");
            }
        }
        System.out.println("]");
    }

}
