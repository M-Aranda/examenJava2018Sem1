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
public class Obra {

    private int id;
    private int autor_fk;
    private int tecnica_fk;
    private int genero_fk;
    private int anioDeCreacion;
    private String nombreDeObra;
    private int tamanio_fk;
    private int ubicacion;

    public Obra(int id, int autor_fk, int tecnica_fk, int genero_fk, int anioDeCreacion, String nombreDeObra, int tamanio_fk, int ubicacion) {
        this.id = id;
        this.autor_fk = autor_fk;
        this.tecnica_fk = tecnica_fk;
        this.genero_fk = genero_fk;
        this.anioDeCreacion = anioDeCreacion;
        this.nombreDeObra = nombreDeObra;
        this.tamanio_fk = tamanio_fk;
        this.ubicacion = ubicacion;
    }

    public Obra() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAutor_fk() {
        return autor_fk;
    }

    public void setAutor_fk(int autor_fk) {
        this.autor_fk = autor_fk;
    }

    public int getTecnica_fk() {
        return tecnica_fk;
    }

    public void setTecnica_fk(int tecnica_fk) {
        this.tecnica_fk = tecnica_fk;
    }

    public int getGenero_fk() {
        return genero_fk;
    }

    public void setGenero_fk(int genero_fk) {
        this.genero_fk = genero_fk;
    }

    public int getAnioDeCreacion() {
        return anioDeCreacion;
    }

    public void setAnioDeCreacion(int anioDeCreacion) {
        this.anioDeCreacion = anioDeCreacion;
    }

    public String getNombreDeObra() {
        return nombreDeObra;
    }

    public void setNombreDeObra(String nombreDeObra) {
        this.nombreDeObra = nombreDeObra;
    }

    public int getTamanio_fk() {
        return tamanio_fk;
    }

    public void setTamanio_fk(int tamanio_fk) {
        this.tamanio_fk = tamanio_fk;
    }

    public int getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(int ubicacion) {
        this.ubicacion = ubicacion;
    }

}
