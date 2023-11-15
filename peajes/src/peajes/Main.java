package peajes;

public class Main {
    public static void main(String[] args) {
    	EstacionPeaje estacionPeaje = new EstacionPeaje("Estacion 1", "Departamento A");

        Carro carro = new Carro("ABC123");
        Moto moto = new Moto("DEF456", 125);
        Camion camion = new Camion("GHI789", 3);

        estacionPeaje.registrarVehiculo(carro);
        estacionPeaje.registrarVehiculo(moto);
        estacionPeaje.registrarVehiculo(camion);

        System.out.println("Total de peajes recolectados: $" + estacionPeaje.getTotalPeajeRecolectado());
    }
}