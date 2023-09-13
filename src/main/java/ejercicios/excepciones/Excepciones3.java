package main.java.ejercicios.excepciones;

public class Excepciones3 {

    public static void main(String[] args) {
        String[] listaPalabras = {"hola","soy","un","extraterrestre"};
        int indice = 5;
        try {
            imprimirIndice(listaPalabras, 5);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("ERROR: La posicion " + indice + " no existe" );
            ex.printStackTrace();
            System.out.println("El programa se ha completado correctamente tras haberse gestionado la excepcion " + ex.getClass());
        }
    }
    private static void imprimirIndice(String[] listaPalabras, int indice) throws ArrayIndexOutOfBoundsException{
        String palabra = listaPalabras[indice];
        System.out.println("La palabra que se encuentra en el indice " + indice + " es: " + listaPalabras);
    }
}
