package modelos;

public class Jugador extends Persona {

    private int dorsal;
    private String posicion;
    private int anoDebut;

    private Estadistica estadisticas;


    public Jugador(String nombre, String apellido, String fechaNac, String pais, int dorsal, String posicion, int anoDebut) {
        super(nombre, apellido, fechaNac, pais);
        this.dorsal = dorsal;
        this.posicion = posicion;
        this.anoDebut = anoDebut;
        this.estadisticas = new Estadistica(0, 0, 0);
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getAnoDebut() {
        return anoDebut;
    }

    public void setAnoDebut(int anoDebut) {
        this.anoDebut = anoDebut;
    }


    public Estadistica getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(Estadistica estadisticas) {
        this.estadisticas = estadisticas;
    }

    public void setEstadisticasPPP(float nuevosPuntos) {
        this.estadisticas.setPpp(nuevosPuntos);
    }

    public void setEstadisticasRPP(float nuevosRebotes) {
        this.estadisticas.setRpp(nuevosRebotes);
    }

    public void setEstadisticasAPP(float nuevosAsistencias) {
        this.estadisticas.setApp(nuevosAsistencias);
    }

    @Override
    public String mostrarInformacion() {
        return "";
    }

    @Override
    public String toString() {
    /*    return "\n-------------------------------" +
                "\nJugador: " + super.toString() +
                "\nDorsal: " + dorsal +
                "\nPosición: " + posicion +
                "\nAño Debut: " + anoDebut +
                "\nEstadísticas: " + estadisticas.toString();*/
        return "\n" + dorsal +
                " | " + getNombre() +
                " | " + posicion;
    }

    public class JugadorDTO {

        String nombre;
        float valorEstadistica;

        public JugadorDTO(String nombre, float valorEstadistica) {
            this.nombre = nombre;
            this.valorEstadistica = valorEstadistica;
        }


    }
}
