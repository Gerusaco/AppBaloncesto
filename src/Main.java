import controlador.EquipoControlador;
import modelos.Entrenador;
import modelos.Equipo;
import modelos.Estadistica;
import modelos.Jugador;
import vistas.EquipoVista;

import javax.naming.ldap.Control;

public class Main {

    public static Equipo Lakers;
    public static EquipoControlador equipoControlador;
    public static EquipoVista equipoVista;

    public static void main(String[] args) {

         equipoVista = new EquipoVista();
         equipoVista.verJugadorMaximoAnotador();
    }

}
