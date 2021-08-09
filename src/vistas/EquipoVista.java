package vistas;

import controlador.EquipoControlador;

public class EquipoVista {

    public EquipoControlador equipoControlador;

    public EquipoVista() {
        this.equipoControlador = new EquipoControlador();
    }

    public void verJugadorMaximoAnotador(){
        System.out.println("Maximo anotador del equipo:");
        System.out.println(equipoControlador.maximoAnotadorEquipo().toString());
    }

}
