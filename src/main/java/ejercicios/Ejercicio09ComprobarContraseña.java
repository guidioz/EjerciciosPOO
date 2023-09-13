package main.java.ejercicios;
/*EJERCICIO
 * Teneis que crear un programa que:
 * 1º Tiene que aparecer por pantalla un mensaje de saludo con vuestro nombre
 * 2º Tiene que comprobar si vuestro usuario y contraseña son correctos
 *
 * Para ello:
 * Crear un método que reciba por parámetro un String y muestre por pantalla el saludo
 * y vuestro nombe
 *
 * Crear un método que recibiendo por parámetros dos String, compruebe que el usuario
 * es vuestro nombre y la contraseña es la vuestra (ojo a donde creais las variables)
 *
 * Mostrar por pantalla un mensaje que indique si el usuaro y la contraseña son correctos.
 * Un mensaje por cada campo (uno para user, otro para pass).
 *
 * No se pide al usuario que introduzca datos, sólo creais variables y las pasáis a los métodos.
 * Y en ellos se hacen las comprobaciones
 *
 * Cread un main() y desde él llamada a cada método.
 * */
public class Ejercicio09ComprobarContraseña {


    public static void main(String[] args) {
        String nombre = "Ruli";
        bienvenida(nombre);
        comprobacionDeUsuarioYContrasenha("Rulas","12345");
    }
    public static void bienvenida(String nombre) {

        System.out.println("Bienvenido " + nombre);
    }
    public static void comprobacionDeUsuarioYContrasenha(String usuario, String contrasenha) {
        String usuario1 = "Ruli";
        String contrasenha1 = "12345";
        if (usuario.equals(usuario1)) {
            System.out.println("El usuario introducido es correcto.");
        }else{
            System.out.println("El usuario introducido es incorrecto \n\t Intentalo de nuevo");
        }
        if (contrasenha.equals(contrasenha1)) {
            System.out.println("La contraseña introducida es correcta.");
        }else{
            System.out.println("La contraseña introducida es incorrecta \n\t Intentalo de nuevo");
        }
    }

}
