package peajes;
import java.util.ArrayList;
import java.util.List;

public class EstacionPeaje {
    private String nombre;
    private String departamento;
    private int totalPeajeRecolectado;
    private List<Vehiculo> vehiculos;

    public EstacionPeaje(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.totalPeajeRecolectado = 0;
        this.vehiculos = new ArrayList<>();
    }

    public void registrarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        int peaje = calcularPeaje(vehiculo);
        totalPeajeRecolectado += peaje;
        System.out.println("Vehículo con placa " + vehiculo.getPlaca() + " pagó $" + peaje + " de peaje.");
    }

    private int calcularPeaje(Vehiculo vehiculo) {
        if (vehiculo instanceof Carro) {
            return 10000;
        } else if (vehiculo instanceof Moto) {
            Moto moto = (Moto) vehiculo;
            if (moto.getCilindraje() <= 200) {
                return 5000;
            } else {
                return 7000;
            }
        } else if (vehiculo instanceof Camion) {
            Camion camion = (Camion) vehiculo;
            return 5000 * camion.getNumeroEjes();
        }
        return 0;
    }

    public int getTotalPeajeRecolectado() {
        return totalPeajeRecolectado;
    }
}