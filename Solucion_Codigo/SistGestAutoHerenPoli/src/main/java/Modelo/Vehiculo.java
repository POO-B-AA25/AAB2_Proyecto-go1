
package Modelo;

/**
 *
 * @author USUARIO
 */
 abstract class Vehiculo {

    public int idAutobus;
    public String placa;
    public int capacidad;

    public Vehiculo() {
    }

    public Vehiculo(int idAutobus, String placa, int capacidad) {
        this.idAutobus = idAutobus;
        this.placa = placa;
        this.capacidad = capacidad;
    }

    public abstract void mostrarDatos();//
    
    @Override
    public String toString() {
        return "Autobús ID: " + idAutobus + ", Placa: " + placa + ", Capacidad: " + capacidad;
    }

}
