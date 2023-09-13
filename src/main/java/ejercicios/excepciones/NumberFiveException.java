package main.java.ejercicios.excepciones;

public class NumberFiveException extends ArithmeticException {

    //Constructor sin mensaje del detalle del error
    public NumberFiveException() {
        super();
    }

    //Constructor pasando por parametro y con mensaje del error
    public NumberFiveException(String errorMessage) {
        super(errorMessage);
    }
}
