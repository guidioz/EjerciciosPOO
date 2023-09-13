package main.java.ejercicios.herencia;

public class Person {
    private String name;
    private String surname;

    public Person(String name,String surname){
        this.name = name;
        this.surname = surname;
    }

    //GETTERS Y SETTERS
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return this.surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    //OTROS METODOS
    public void showDetails(){
        System.out.println("Nombre completo de  la "+ this.getClass() + " es " + name + " " + surname);
    }

}
