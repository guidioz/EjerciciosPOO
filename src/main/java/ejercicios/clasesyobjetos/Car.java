package main.java.ejercicios.clasesyobjetos;

public class Car {
    String brand;
    String model;
    int maxSpeed;
    String fuel;
    int speedometer = 0;
    int tachometer = 0;
    boolean carOn = false;
    int wheelPosition = 0;
    final int MAX_STEERING_WHEEL_ANGLE_RIGHT = -180;
    final int MAX_STEERING_WHEEL_ANGLE_LEFT = 180;
    //Crear constructor
    public Car(String brand,String model,int maxSpeed,String fuel) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.fuel = fuel;
    }

    public static void main(String[] args) {

    }
    //Metodo para encender
    public void start() {
        if(this.carOn == false) {
            this.carOn = true;
            System.out.println("El " + this.brand + " se acaba de encender");
        }else{
            System.out.println("El " + this.brand + "no se puede encender, debido a que ya esta encendido.");
        }
    }
    //Metodo para apagar
    public void stop() {
        if (this.carOn == true) {
            if (this.speedometer == 0) {
                this.carOn = false;
                System.out.println("El " + this.brand + " se ha apagado");
            } else {
                System.out.println("El " + this.brand + " no se ha podido apagar ya que el coche esta en movimiento");
            }
        }else{
                System.out.println("El " + this.brand + " no se ha podido apagar, debido a que ya esta apagado.");
            }
        }

    //Metodo para acelerar
    public void accelerate(int nuevaVelocidad ) {
        if(this.carOn == true) {
            if(this.maxSpeed>= nuevaVelocidad){
                if(this.speedometer < nuevaVelocidad){
                    this.speedometer = nuevaVelocidad;
                    System.out.println("El " + this.brand + " ha acelerado hasta " + this.speedometer + " km/h");
                }else {
                    System.out.println("El " + this.brand + " va a " + this.speedometer + " km/h y no puede acelerar hasta " + nuevaVelocidad + "km/h, ya que estaria frenando.");
                }
            }else{
                System.out.println("El " + this.brand + " no puede acelerar hasta esa velocidad, ya que sobrepasa su velocidad maxima ");
            }
        } else{
            System.out.println("El " + this.brand + " esta apagado, debes encenderlo para acelerar");
        }

    }

    public void brake(int nuevaVelocidad) {
        if(this.carOn == true){
            if (this.speedometer > nuevaVelocidad){
                this.speedometer = nuevaVelocidad;
                System.out.println("El " + this.brand + " ha reducido hasta " + this.speedometer + " km/h");
            }else {
                System.out.println("El " + this.brand + " va a " + this.speedometer + " km/h y no puede frenar hasta " + nuevaVelocidad + "km/h,ya que estaria acelerando.");
            }
        }else {
            System.out.println("El " + this.brand + " esta apagado, debes encenderlo para frenar");
        }

    }

    //Derecha (negativo), Izquierda (positivo).
    public void turnSteerWheel(int anguloGiro){

        if(this.wheelPosition + anguloGiro >= this.MAX_STEERING_WHEEL_ANGLE_RIGHT && this.wheelPosition + anguloGiro <= this.MAX_STEERING_WHEEL_ANGLE_LEFT){
            this.wheelPosition = this.wheelPosition + anguloGiro;
            System.out.println("El volante del " + this.brand + " esta girado a "+ this.wheelPosition+ " grados");
        }else if(!(this.wheelPosition + anguloGiro >= this.MAX_STEERING_WHEEL_ANGLE_RIGHT)) {
            System.out.println("El volante del " + this.brand + " ya ha alcanzado el maximo giro hacia la derecha");
        }else if(!(this.wheelPosition + anguloGiro <= this.MAX_STEERING_WHEEL_ANGLE_LEFT)) {
            System.out.println("El volante del " + this.brand + " ya ha alcanzado el maximo giro hacia la iquierda");
        }

    }


    }

