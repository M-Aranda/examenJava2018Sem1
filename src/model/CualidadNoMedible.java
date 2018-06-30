/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import interfases.Obreable;

/**
 *
 * @author Marce
 */
public abstract class CualidadNoMedible implements Obreable {

    int id;
    String nombre;

    public CualidadNoMedible(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

}
