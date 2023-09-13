package main.java.ejercicios;

public class Ejercicio02ConversionDeTipos {

    public static void main(String[] args) {
        String conversion = "200"; //esto es un String
        System.out.println("Variable de tipo String " + conversion);

        Integer conversionEntero = Integer.parseInt(conversion); //esto ya es un Integer
        System.out.println("Variable de tipo Integer " + conversionEntero);

        String conversionDeNuevoAString = Integer.toString(conversionEntero); //esto es de nuevo un String
        System.out.println("Variable de tipo String " + conversionDeNuevoAString);

        char variableChar = conversionDeNuevoAString.charAt(0); //esto ya es un carácter, una letra, del String. En concreto la letra "2"
        System.out.println("Variable de tipo char " + variableChar);

        String otraVezDeNuevoAString = String.valueOf(variableChar); //Covertimos el char anterior '2' a String "2"
        System.out.println("Variable de tipo String " + otraVezDeNuevoAString);

        Double porUltimoADouble = Double.parseDouble(otraVezDeNuevoAString); //Y ahora el "2" anterior es un número, un Double con valor 2.0
        System.out.println("Variable de tipo Double " + porUltimoADouble); //Sacará por la consola el 2.0 del Double.
    }


}//final Ejercicio02ConversionDeTipos
