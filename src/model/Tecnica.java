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
public class Tecnica extends CualidadNoMedible {

    public Tecnica(int id, String nombre) {
        super(id, nombre);
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
    public void setId(int id) {
        super.id = id;
    }

    @Override
    public void setNombre(String nombre) {
        super.nombre = nombre;
    }

    @Override
    public String toString() {
        return super.nombre;
    }

    
    
}
