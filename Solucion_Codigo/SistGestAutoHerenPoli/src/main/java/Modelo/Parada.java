/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


/**
 *
 * @author josef
 */
public class Parada {

    public int idParada;
    public String nombre;
    public String ubicacion;

    public Parada() {

    }

    public Parada(int idParada, String nombre, String ubicacion) {
        this.idParada = idParada;
        this.nombre = nombre;
        this.ubicacion = ubicacion;

    }

    @Override
    public String toString() {
        return "Parada ID: " + idParada + ", Nombre: " + nombre + ", Ubicación: " + ubicacion;
    }
}
