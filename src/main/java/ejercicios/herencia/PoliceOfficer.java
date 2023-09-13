package main.java.ejercicios.herencia;

public class PoliceOfficer extends Person {

    private String squad;

    public PoliceOfficer(String squad, String name, String surname){
        super(name,surname);
        this.squad = squad;

    }

    public String getSquad(){
        return this.squad;
    }

    public void setSquad(String squad){
        this.squad = squad;
    }

    @Override
    public void showDetails(){
        System.out.println("Doctor "+ getName() + " " + getSurname() + " , especialista en " + this.squad);
    }
}
