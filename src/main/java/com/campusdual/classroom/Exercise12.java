package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
        Car coche= new Car("Citroen", "Xsara", "Diesel");

        //coche.start();
        //coche.accelerate();
        //coche.stop();
        //coche.showDetails();
        //coche.showDetails();

        // Intentar encender el coche
        coche.start();

        // Acelerar el coche a 50 km/h
        coche.accelerate();

        // Intentar encender el coche cuando ya está encendido
        coche.start();

        // Frenar el coche
        coche.brake();

        // Intentar frenar por debajo de 0
        coche.brake();

        // Girar el volante 20 grados
        coche.turnAngleOfWheels(20);

        // Intentar girar el volante más de 45 grados
        coche.turnAngleOfWheels(45);

        // Intentar poner marcha atrás mientras el coche está en movimiento
        coche.setReverse(true);

        // Detener el coche y poner marcha atrás
        coche.brake();
        coche.setReverse(true);

        // Mostrar detalles finales
        coche.showDetails();
    }

}