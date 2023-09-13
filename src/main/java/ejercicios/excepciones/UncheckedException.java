package main.java.ejercicios.excepciones;

public class UncheckedException extends RuntimeException {

    //Constructor sin mensaje del detalle del error
    public UncheckedException() {
        super();
    }

    //Constructor pasando por parametro y con mensaje del error
    public UncheckedException(String errorMessage) {
        super(errorMessage);
    }
}
