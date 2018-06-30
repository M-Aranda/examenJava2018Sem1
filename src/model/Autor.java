/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Marce
 */
public class Autor extends Persona {

    private String apellido;
    private String nacionalidad;

    public Autor(String apellido, String nacionalidad, int id, String nombre, String rut) {
        super(id, nombre, rut);
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
    }




    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
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

    @Override
    public String toString() {
        return super.nombre;
    }
    

}
