package controlador;

import modelos.*;

import java.util.ArrayList;

public class EquipoControlador {

    Equipo equipo;

    public EquipoControlador() {
        obtenerEquipoBaseDatosFake();
    }

    // Dado el equipo del controlador recorre la lista de jugadores y obten el máximo anotador del equipo por estadistica.
    public Jugador maximoAnotadorEquipo(){

        float maxPpp = 0f;
        Jugador jugadorMaxPpp = null;
        for (Jugador jugador: this.equipo.getListaJugadores()){
            float ppp = jugador.getEstadisticas().getPpp();

            if (ppp>maxPpp){
                maxPpp=ppp;
                jugadorMaxPpp = jugador;
            }

        }

        return jugadorMaxPpp;
    }
    //TODO 2: Mostrar la media de PPP, REBOTES y ASISTENCIAS de todo el equipo. NOTA: Si tienes que crear otros metodos en otras clases peudes hacerlo.
    public Estadistica mediaEquipo(){

        return null;
    }

    //TODO 3: Mostrar los jugadores que están por encima de la media de equipo en rebotes. NOTA: El metodo anterior ya nos devuelve las estadisticas media
    public ArrayList<Jugador> jugadoresMediaRebotes(){

        return null;
    }
    //TODO 4: Dada un tipo de estadistica, devuelve la de cada jugador. Por ejemplo, Asistencias -> Lebron 3 - Marc 1 - ...
    public Jugador.JugadorDTO getEstadisticaJugador(TipoEstadistica tipoEstadistica){

        Jugador.JugadorDTO jugadorDTO = null;

        switch (tipoEstadistica){
            case PUNTOS:

                break;
            case REBOTES:

                break;
            case ASISTENCIAS:


                break;
        }
        return jugadorDTO;
    }



    /* DATOS FAKE */
    private void obtenerEquipoBaseDatosFake(){
        //Entrenador
        Entrenador e= new Entrenador("Sergio","Scariolo","1900-01-01","Italia",true,10);
        //System.out.println(e.toString());
        Jugador j = new Jugador("Pau","Gasol","1981-07-01","España",4,"AP",2000);
        //System.out.println(j.toString());
        j.setEstadisticasRPP(12.4f);
        //System.out.println(j.toString());
        j.setEstadisticas(new Estadistica(21.4f,12f,8.1f));
        //System.out.println(j.toString());

        // Crear equipo
        equipo = new Equipo("Lakers","Los Angeles",17);

        //Crear 5 jugadores
        Jugador Lebron = new Jugador("Lebron","James","30/12/1984","Estados Unidos",23,"Escolta",2003);

        Lebron.setEstadisticas(new Estadistica(32.4f,10f,8.1f));
        Jugador Dennis = new Jugador("Dennis","Schröder","15/09/1993","Alemania",17,"Base",2013);
        Dennis.setEstadisticas(new Estadistica(12.4f,6f,8.1f));
        Jugador Anthony = new Jugador("Anthony","Davis","11/03/1993","Estados Unidos",3,"Ala-pivot",2012);
        Anthony.setEstadisticas(new Estadistica(21.4f,15f,8.1f));
        Jugador Russell = new Jugador("Russell","Westbrook","12/11/1988","Estados Unidos",4,"Base",2008);
        Russell.setEstadisticas(new Estadistica(43.4f,2f,8.1f));
        Jugador Marc = new Jugador("Marc","Gasol","29/01/1985","España",14,"Pivot",2007);
        Marc.setEstadisticas(new Estadistica(10.4f,16f,8.1f));

        //Agregar los jugadores al equipo
        equipo.setAgregarJugador(Lebron);
        equipo.setAgregarJugador(Dennis);
        equipo.setAgregarJugador(Anthony);
        equipo.setAgregarJugador(Russell);
        equipo.setAgregarJugador(Marc);

    }


}
