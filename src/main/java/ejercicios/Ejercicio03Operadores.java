package main.java.ejercicios;

public class Ejercicio03Operadores {
    public static void main(String[] args) {
        int valor = 5; //vale 5
        valor = valor + 3; //vale 8
        valor = 2 - valor; //vale -6
        valor += 3; //valor = valor +3; //vale -3
        valor -= 1; //valor = valor -1; //vale -4
        valor *= 4;                  // valor = valor * 4 / vale -16
        valor = (valor / 2) + 1;     // vale -7
        int nuevo = 3;               // nuevo (valor) = 3
        int miValor = 2;             // nuevo (valor) = 2
        valor = nuevo + miValor;     // nuevo (3) + miValor (2) = 5
        final int CONST = 2;         // vale 2
        valor = CONST;               // valor = CONST (2) / vale 2
        valor += 3;                  // valor = valor +3 / vale 5

        System.out.println(valor);
    }

}
