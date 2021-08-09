package modelos;

import utils.Constantes;

import java.util.ArrayList;

public class Equipo {

    private String nombre;
    private String ciudad;
    private int titulos;
    private ArrayList<Jugador> listaJugadores;

    public Equipo(String nombre, String ciudad, int titulos) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.titulos = titulos;
        this.listaJugadores = new ArrayList<>();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getTitulos() {
        return titulos;
    }

    public void setTitulos(int titulos) {
        this.titulos = titulos;
    }

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public void setAgregarJugador(Jugador jugador){
        if (listaJugadores.size() < Constantes.JUGADORES_MAXIMO_POR_EQUIPO) {
            this.listaJugadores.add(jugador);
        }
    }

    /*Crear metodo que muestre la información del equipo. NOTA: Si tienes que cambiar algo de la clase jugador puedes hacerlo*/
    @Override
    public String toString() {
        /*return "\nEquipo: " + nombre +
                "\nCiudad: " + ciudad +
                "\nTitulos: " + titulos +
                "\nJugadores: " + listaJugadores;*/
        return "\n" + nombre +
                " | " + ciudad +
                " | " + titulos + " campeonatos\n" +
                listaJugadores;
    }
}
