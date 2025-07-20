package Modelo;

public class Autobus extends Vehiculo {

    public Ruta rutaAsignada = new Ruta();//RELACION EN EL UML

    public Autobus() {//CONSTRUCTOR POR DEFECTO//POLIMORFISMO

    }

    public Autobus(int idAutobus, String placa, int capacidad, Ruta rutaAsignada) {//CONSTRUCTOR POR PARAMETROS
        super(idAutobus, placa, capacidad);
        this.rutaAsignada = rutaAsignada;//POLIMORFISMO DIFERENTE ESTRUCTURA INTERNA
    }

    @Override
    public String toString() {
        return "Autobús ID: " + super.toString() + "rUTA ASIGNADA" + rutaAsignada;

    }

    @Override
    public void mostrarDatos() {//POLIMORFISMO 
        System.out.println("Autobús ID: " + idAutobus + ", Placa: " + placa + ", Capacidad: " + capacidad + "Ruta asignada" + rutaAsignada);        
    }
}
