package main.java.ejercicios.excepciones;
import java.io.IOException;
public class CheckedException extends IOException {

    //Constructor sin mensaje del detalle del error
    public CheckedException() {super();}

    //Constructor pasando por parametro y con mensaje del error
    public CheckedException(String errorMessage) {
        super(errorMessage);
    }
}
