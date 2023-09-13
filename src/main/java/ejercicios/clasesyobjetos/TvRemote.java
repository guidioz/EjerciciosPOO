package main.java.ejercicios.clasesyobjetos;

public class TvRemote {
    //Atributos (acceso protected por defecto)
    int channel;
    int volume;
    boolean tvOn; //true si la tele está encendida, false si no
    String color; //color del mando a distancia
    final int CHANNEL_MIN_VALUE = 0; //constante para todos los mandos. El mínimo canal de la tele es el 0
    final int CHANNEL_MAX_VALUE = 30; //costente para todos los mandos. El máximo número de canales de la tele es 30
    final int VOLUME_MIN_VALUE = 0;
    final int VOLUME_MAX_VALUE = 35;

    //Constructor: sólo recibe por parámetro el color del nuevo mando a distancia
    //CADA NUEVO MANDO TENDRÁ UN BOTÓN PARA ENCENDER Y OTRO PARA APAGAR
    public TvRemote(String color) {
        this.channel = 0; //al crear un nuevo mando, el canal por defecto es el 0
        this.volume = 20; //al crear un nuevo mando, el volumen que envía a la tele es 20
        this.color = color;
    }

    //Método para encender la tele
    public void turnOn() {
        if(this.tvOn == false) { //Comprueba si la tele estaba apagada
            this.tvOn = true; //si estaba apagada, la enciende
            System.out.println("La tele se ha encendido");
        } else { //si ya estaba encendida
            System.out.println("La tele ya estaba encendida");
        }
    }

    //Método para apagar la tele
    public void turnOff() {
        if(this.tvOn == true) { //Comprueba si la tele estaba encendida
            this.tvOn = false;//si estaba encendida, la apaga
            System.out.println("La tele se ha apagado");
        } else { //si ya estaba apagada
            System.out.println("La tele ya estaba apagada");
        }
    }

    //Método para subir un canal
    public void channelUp() {
        if(this.tvOn==true) {
            if (this.CHANNEL_MAX_VALUE == this.channel) { //Comprueba si la tele ya está en el último canal
                System.out.println("La tele ya está en el último canal");
            } else { //si no está en el máximo canal, sube uno
                this.channel++;
                System.out.println("El canal se ha aumentado con exito al " + this.channel);
            }
        }else{
            System.out.println("No se puede cambiar de canal ya que la tele esta apagada");
        }
    }

    //Método para bajar un canal
    public void channelDown() {
        if (this.tvOn==true){
            if (this.CHANNEL_MIN_VALUE == this.channel) { //Comprueba si la tele ya está en el primer canal, el 0
                System.out.println("La tele ya está en el primer canal, el 0");
            } else { //si no está en el primer canal, baja uno
                this.channel--;
                System.out.println("El canal se ha disminuido con exito al " + this.channel);
            }
        }else{
            System.out.println("No se puede cambiar de canal ya que la tele esta apagada");
        }
    }

    //Método para subir el volumen
    public void volumeUp() {
        if(this.tvOn==true) {
            if (this.VOLUME_MAX_VALUE == this.volume) { //Comprueba si la tele ya está al máximo de volumen
                System.out.println("La tele ya está al máximo de volumen");
            } else { //si no está en el valor máximo de volumen, sube una unidad
                this.volume++;
                System.out.println("El volumen se ha aumentado con exito hasta " + this.volume);
            }
        }else{
            System.out.println("No se puede subir el volumen de la tele ya que esta apagada");
        }
    }

    //Método para bajar el volumen
    public void volumeDown() {
        if(this.tvOn==true) {
            if (this.VOLUME_MIN_VALUE == this.volume) { //Comprueba si la tele ya está al mínimo de volumen, el 0
                System.out.println("La tele ya está al mínimo de volumen");
            } else { //si no está en el valor mínimo, baja una unidad
                this.volume--;
                System.out.println("El volumen se ha disminuido con exito hasta " + this.volume);
            }
        }else{
            System.out.println("No se puede bajar el volumen de la tele ya que esta apagada");
        }
    }
//Todo --> COMPROBAR EN LOS MÉTODOS DE CANAL Y VOLUMEN QUE LA TELE ESTÁ ENCENDIDA
}
