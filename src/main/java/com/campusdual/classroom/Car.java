package com.campusdual.classroom;

public class Car {
    // Atributos
    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer = 0; // Velocímetro (velocidad)
    public int tachometer = 0;  // Tacómetro (revoluciones por minuto)
    public String gear = "N";   // Marcha, inicialmente en neutro
    public boolean reverse = false; // Indica si está en marcha atrás
    public int wheelsAngle = 0;  // Ángulo de las ruedas

    // Constructor
    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public Car() {}

    // Método para encender el coche
    public void start() {
        if (this.tachometer == 0) {
            this.tachometer = 1000; // Valor típico del tacómetro al encender
            System.out.println("Vehículo encendido.");
        } else {
            System.out.println("El vehículo ya está encendido.");
        }
    }

    // Método para apagar el coche
    public void stop() {
        if (this.speedometer == 0) {
            this.tachometer = 0; // Al apagar el tacómetro debe quedar en 0
            System.out.println("Vehículo apagado.");
        } else {
            System.out.println("No se puede apagar el vehículo, debe estar detenido.");
        }
    }

    // Método para acelerar
    public void accelerate() {
        if (this.tachometer == 0) {
            System.out.println("Primero debes encender el coche.");
        } else if (this.speedometer + tachometer > MAX_SPEED) {
            this.speedometer = MAX_SPEED;
            System.out.println("Has alcanzado la velocidad máxima de " + MAX_SPEED + " km/h.");
        } else {
            this.speedometer += tachometer;
            System.out.println("Acelerando, nueva velocidad: " + this.speedometer + " km/h.");
        }
    }

    // Método para frenar
    public void brake() {
        if (this.speedometer < 0) {
            this.speedometer = 0;
            System.out.println("El coche está completamente detenido.");
        } else {
            this.speedometer --;
            System.out.println("Frenando, nueva velocidad: " + this.speedometer + " km/h.");
        }
    }

    // Método para girar las ruedas
    public void turnAngleOfWheels(int angle) {
        if (angle > 45 || angle < -45) {
            System.out.println("No se puede girar el volante más de 45 o -45 grados.");
        } else {
            this.wheelsAngle = angle;
            System.out.println("Ángulo de las ruedas ajustado a: " + this.wheelsAngle + " grados.");
        }
    }

    // Verificar si el tacómetro es 0
    public boolean isTachometerEqualToZero() {
        return this.tachometer == 0;
    }

    // Mostrar detalles del coche
    public void showDetails() {
        System.out.println("Marca: " + this.brand);
        System.out.println("Modelo: " + this.model);
        System.out.println("Combustible: " + this.fuel);
        System.out.println("Velocímetro: " + this.speedometer + " km/h");
        System.out.println("Tacómetro: " + this.tachometer + " RPM");
        System.out.println("Marcha: " + this.gear);
        System.out.println("Ángulo de las ruedas: " + this.wheelsAngle + " grados");
        System.out.println("Marcha atrás: " + (this.reverse ? "Sí" : "No"));
    }

    // Método para activar/desactivar la marcha atrás
    public void setReverse(boolean reverse) {
        if (this.speedometer > 0 && reverse) {
            System.out.println("No se puede poner marcha atrás mientras el coche está en movimiento hacia adelante.");
        } else {
            this.reverse = reverse;
            this.gear = reverse ? "R" : "N";
            System.out.println("El coche está en marcha atrás: " + this.reverse);
        }
    }

    public boolean isTachometerGreaterThanZero() {
        return this.tachometer==0;
    }
}
