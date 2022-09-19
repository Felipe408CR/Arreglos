package clases;

public class Estudiante {

    private String nombre;
    private int edad;
    private String telefono;
    private String id;
    private boolean becado;

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, String telefono, String id, boolean becado) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.id = id;
        this.becado = becado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isBecado() {
        return becado;
    }

    public void setBecado(boolean becado) {
        this.becado = becado;
    }



}
