package main.java.ejercicios.herencia;

public class Teacher extends Person{

    private String area;

    public Teacher(String area, String name, String surname) {
        super(name, surname);
        this.area = area;
    }

    public String getArea(){
        return this.area;
    }

    public void setArea(String area){
        this.area = area;
    }
}
