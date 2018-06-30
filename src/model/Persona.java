/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import interfases.Personeable;

/**
 *
 * @author Marce
 */
public abstract class Persona implements Personeable {

    int id;
    String nombre;
    String rut;

    public Persona(int id, String nombre, String rut) {
        this.id = id;
        this.nombre = nombre;
        this.rut = rut;
    }

}
