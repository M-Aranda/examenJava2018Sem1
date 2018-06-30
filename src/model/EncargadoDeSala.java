package model;

public class EncargadoDeSala extends Persona {

    private String profesion;
    private int anioDeIngreso;

    public EncargadoDeSala(String profesion, int anioDeIngreso, int id, String nombre, String rut) {
        super(id, nombre, rut);
        this.profesion = profesion;
        this.anioDeIngreso = anioDeIngreso;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getAnioDeIngreso() {
        return anioDeIngreso;
    }

    public void setAnioDeIngreso(int anioDeIngreso) {
        this.anioDeIngreso = anioDeIngreso;
    }

    @Override
    public int getId() {
        return super.id;
    }

    @Override
    public String getNombre() {
        return super.nombre;
    }

    @Override
    public String getRut() {
        return super.rut;
    }

    @Override
    public void setId(int id) {
        super.id = id;
    }

    @Override
    public void setNombre(String nombre) {
        super.nombre = nombre;
    }

    @Override
    public void setRut(String rut) {
        super.rut = rut;
    }

}
