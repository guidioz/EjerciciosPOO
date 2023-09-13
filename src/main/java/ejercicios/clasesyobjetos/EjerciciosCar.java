package main.java.ejercicios.clasesyobjetos;

public class EjerciciosCar {

    public static void main(String[] args) {

        //Crear el coche con el contructor "Car"
        Car citroen = new Car("Citroen","C3",240,"Gasolina");
        Car seat = new Car("Seat","Ibiza",180,"Diesel");

        citroen.start();
        citroen.accelerate(270);
        citroen.turnSteerWheel(-160);
        citroen.turnSteerWheel(-21);
    }



}
