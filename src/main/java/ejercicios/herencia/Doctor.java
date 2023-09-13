package main.java.ejercicios.herencia;

public class Doctor extends Person{
    private String specialization;

    public Doctor(String specialization, String name, String surname){
        super(name,surname);
        this.specialization = specialization;
    }


    public String getSpecialization(){
        return this.specialization;
    }

    public void setSpecialization(String specialization){
        this.specialization= specialization;
    }

    @Override
    public void showDetails(){
        System.out.println("Doctor "+ getName() + " " + getSurname() + " , especialista en " + this.specialization);
    }
}
