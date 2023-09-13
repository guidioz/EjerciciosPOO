package main.java.ejercicios.excepciones;

import java.io.*;

public class Excepciones4 {
    public void readFile() throws IOException {
        File file = new File("file.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String readLine = "";

        System.out.println("Contenido del fichero:\n");

        while ((readLine = br.readLine()) != null) {
            System.out.println(readLine);
        }
    }

    public static void main(String[] args) {
        Excepciones4 e4 = new Excepciones4();

        try {
            e4.readFile();
        } catch (FileNotFoundException ex){
            System.out.println("Se produjo una excepción al entrar al fichero");
            ex.printStackTrace();
        } catch (IOException e) {
            System.out.println("Hubo una excepción");
            e.printStackTrace();
        } finally {
            System.out.println("\nFin del programa");
        }
    }
}
