package main.java.ejercicios.excepciones;

public class Excepciones6 {

    public static void main(String[] args) {

        try {
            metodoChecked();
        } catch (CheckedException e) {
            System.out.println("Se lanzó una excepción checked");
            e.printStackTrace();
        }

        try {
            metodoUnchecked();
        }catch (UncheckedException ue) {
            System.out.println("Se lanzó una excepción unchecked");
            ue.printStackTrace();
        }

    }
    public static void metodoUnchecked() throws UncheckedException {
        throw new UncheckedException();
    }
    public static void metodoChecked() throws CheckedException {
        throw new CheckedException();
    }
}
