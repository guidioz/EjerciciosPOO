package main.java.ejercicios.herencia;

public class EjerciciosHerencia {
    public static void main(String[] args) {
        //Crear un nuevo Person
        Person persona1 = new Person("Ramon","Tamames");

        //Crear una nueva Teacher
        Teacher missRamona = new Teacher("Matematicas","Ramona","Jimenez");

        //Crear un nuevo PoliceOfficer
        PoliceOfficer agentePatata = new PoliceOfficer("Antivicio","Rufino","Patata");

        //Crear un nuevo Doctor
        Doctor goodDoctor = new Doctor("Pediatria","Peter","Parker");

        persona1.showDetails();
        missRamona.showDetails();
        agentePatata.showDetails();
        goodDoctor.showDetails();



    }
}
