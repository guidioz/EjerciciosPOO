package main.java.ejercicios.clasesyobjetos;

public class EjerciciosTvRemote {

    //Crear un main()
    //Crear un mando a distanca negro
    //Subir el volumen. ¿Se puede? Explica por qué
    //Encender la tele
    //Crear un mensaje que muestre por pantalla cuál es el volumen
    //actual de la tele y en qué canal se encuentra
    //Bajar un canal. ¿Se puede? Explica por qué
    //Subir el volumen. ¿Se puede? Explica por qué
    //Encender la tele. ¿Se puede? Explica por qué
    //Subir un canal
    //Apagar la tele

    public static void main(String[] args) {
        TvRemote mandoNegro = new TvRemote("negro");

        mandoNegro.volumeUp();//No se puede ya que la tele esta apagada
        mandoNegro.turnOn();
        System.out.println("El volumen actual es "+ mandoNegro.volume + " ,y esta en el canal " + mandoNegro.channel);
        mandoNegro.channelDown();//No se puede ya que esta en el canal `0´, y no hay uno menor
        mandoNegro.volumeUp();//Se puede sin problema mientras la tele este encendida y no estemos en el volumen maximo
        mandoNegro.turnOn();//No se puede porque ya esta encendida
        mandoNegro.channelUp();
        mandoNegro.turnOff();

    }

}
