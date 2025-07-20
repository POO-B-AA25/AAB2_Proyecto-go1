package Controlador;

import Modelo.Horario;
import java.util.ArrayList;
import java.util.List;
import Modelo.Parada;
import Modelo.Ruta;
import java.time.LocalTime;
import java.util.Comparator;

public class ControladorRuta {

    List<Horario> horarios = new ArrayList();//ATRIBUTO PARA LISTAR HORARIOS
    List<Parada> paradas = new ArrayList();// ATRIBUTO PARA LISTAR PARADAS

    Ruta ruta = new Ruta();//OBJETO PARA ASIGNAR Y OBTENER VALORES

    public List<Horario> obtenerHorarios( List<Horario> horarios ) {
        return horarios;// LISTA PARA RETORNAR VARIOS HORARIOS
    }

    public boolean esHoraValida(LocalTime horaSalida, LocalTime horaLlegada) {
        return horaSalida.isAfter(horaLlegada);//VALIDA SI LA HORA DE LLEGADA ES V O F QUE LA HORA DE SALIDA CON EL BOOLEAN
    }

    public void agregarParada(Parada parada) {//METODO QUE ERECIBE UN OBJETO DE TIPO PARADA 
        paradas.add(parada);// AGREGA  UNA LISTA LA DE LA LINEA 14 
    }

    public List<Parada> removerParada(int id_parada, List<Parada> paradas) {
        boolean okDelete = false;// SE NECESITA PARA ELIMINAR PARA QUE ESTA EN EL INTERNO 
        for (int i = 0; i < paradas.size(); i++) {
            Parada p = paradas.get(i);
            if (p.idParada == id_parada) {
                paradas.remove(p);
                okDelete = true;
                break;//SIRVE PARA SALTAR EL CODIGO Y FINALIZAR EN EL BLOQUE DEL FOR
            }
        }
        if (okDelete == true) {
            System.out.println("Parada eliminada");
        } else {
            System.out.println("No existe la parada...");
        }
        return paradas;
    }

    public void mostrarParadas(List<Parada> paradas) {
        //agregar verifcar si la lista esta vacia
        
        System.out.println("\n Las paradas que tienes son: ");
        for (int i = 0; i < paradas.size(); i++) {
            Parada get = paradas.get(i);
            System.out.println(get);
        }
    }

    public void mostrarRutas(List<Ruta> rutas) {
        if (rutas.isEmpty()) {
            System.out.println("No hay rutas registradas.");
            return;
        }
        System.out.println("Las rutas que tienes son: ");
        for (Ruta ruta : rutas) {
            System.out.println("\n" + ruta);
        }
    }

    public void mostrarRutasHorarioyParada(List<Ruta> rutas) {
        if (rutas.isEmpty()) {
            System.out.println("No hay rutas registradas.");
            return;
        }
        System.out.println("Las rutas que tienes son: ");
        for (Ruta ruta : rutas) {
            System.out.println("\n" + ruta);            
            for (Parada parada : ruta.paradas) {
                System.out.println("Paradas:\n" + parada.toString());                
                for (Horario horario : obtenerHorarios(ruta.horarios)) {
                    System.out.println("    " + horario.toString());
                }
            }
        }
    }

    public void optimizarRuta(List<Ruta> rutas, int seleccion) {
        Ruta ruta = rutas.get(seleccion - 1);
        ruta.paradas.sort(Comparator.comparing(p -> p.nombre));
        System.out.println("Ruta optimizada por orden alfabético de paradas.");
        mostrarRutasHorarioyParada(rutas);
    }

    public void agregarParadaARuta(List<Ruta> rutas) {
        System.out.println("\n");
        if (rutas.isEmpty()) {
            System.out.println("Primero debe crear una ruta.");
            return;
        }
        System.out.println("Seleccione la ruta:");
        mostrarRutas(rutas);

    }
}
