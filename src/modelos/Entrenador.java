package modelos;

public class Entrenador extends Persona {

    private boolean esPrincipal;
    private int antiguedad;



    public Entrenador(String nombre, String apellido, String fechaNac, String pais, boolean esPrincipal, int antiguedad) {
        super(nombre, apellido, fechaNac, pais);
        this.esPrincipal = esPrincipal;
        this.antiguedad = antiguedad;
    }

    public boolean isEsPrincipal() {
        return esPrincipal;
    }

    public void setEsPrincipal(boolean esPrincipal) {
        this.esPrincipal = esPrincipal;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String mostrarInformacion() {
        return "";
    }

    @Override
    public String toString() {
        return "Entrenador{" +"persona=" + super.toString() +
                "esPrincipal=" + esPrincipal +
                ", antiguedad=" + antiguedad +
                '}';
    }
}
