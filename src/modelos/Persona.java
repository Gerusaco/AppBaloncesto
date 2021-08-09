package modelos;

public abstract class Persona {

    //Atributos o propiedades de la clase
    private String nombre;
    private String apellido;
    private String fechaNac;
    private String pais;


    public Persona(String nombre, String apellido, String fechaNac, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    public abstract String mostrarInformacion();

    @Override
    public String toString() {
        return "\nNombre: " + nombre +
                "\nApellido: " + apellido +
                "\nFecha Nacimiento: " + fechaNac +
                "\nPais: " + pais;
    }
}
