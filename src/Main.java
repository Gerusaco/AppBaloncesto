import modelos.Entrenador;
import modelos.Equipo;
import modelos.Estadistica;
import modelos.Jugador;

public class Main {

    public static void main(String[] args) {

        //Entrenador
        Entrenador e= new Entrenador("Sergio","Scariolo","1900-01-01","Italia",true,10);
        //System.out.println(e.toString());
        Jugador j = new Jugador("Pau","Gasol","1981-07-01","España",4,"AP",2000);
        //System.out.println(j.toString());
        j.setEstadisticasRPP(12.4f);
        //System.out.println(j.toString());
        j.setEstadisticas(new Estadistica(21.4f,12f,8.1f));
        //System.out.println(j.toString());

        //TODO: 1. Crear equipo
        Equipo Lakers = new Equipo("Lakers","Los Angeles",17);

        //TODO 2. Crear 5 jugadores
        Jugador Lebron = new Jugador("Lebron","James","30/12/1984","Estados Unidos",23,"Escolta",2003);
        Jugador Dennis = new Jugador("Dennis","Schröder","15/09/1993","Alemania",17,"Base",2013);
        Jugador Anthony = new Jugador("Anthony","Davis","11/03/1993","Estados Unidos",3,"Ala-pivot",2012);
        Jugador Russell = new Jugador("Russell","Westbrook","12/11/1988","Estados Unidos",4,"Base",2008);
        Jugador Marc = new Jugador("Marc","Gasol","29/01/1985","España",14,"Pivot",2007);

        //TODO 3. Agregar los jugadores al equipo
        Lakers.setAgregarJugador(Lebron);
        Lakers.setAgregarJugador(Dennis);
        Lakers.setAgregarJugador(Anthony);
        Lakers.setAgregarJugador(Russell);
        Lakers.setAgregarJugador(Marc);

        //TODO 4. Mostrar información del equipo
        System.out.println(Lakers.toString());




    }


}
