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
    private Autor autor;
    private Tecnica tecnica;
    private Genero genero;
    private int anioDeCreacion;
    private String nombreDeObra;
    private Tamanio tamanio;
    private Sala ubicacion;

    public Obra(int id, Autor autor, Tecnica tecnica, Genero genero, int anioDeCreacion, String nombreDeObra, Tamanio tamanio, Sala ubicacion) {
        this.id = id;
        this.autor = autor;
        this.tecnica = tecnica;
        this.genero = genero;
        this.anioDeCreacion = anioDeCreacion;
        this.nombreDeObra = nombreDeObra;
        this.tamanio = tamanio;
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

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Tecnica getTecnica() {
        return tecnica;
    }

    public void setTecnica(Tecnica tecnica) {
        this.tecnica = tecnica;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
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

    public Tamanio getTamanio() {
        return tamanio;
    }

    public void setTamanio(Tamanio tamanio) {
        this.tamanio = tamanio;
    }

    public Sala getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Sala ubicacion) {
        this.ubicacion = ubicacion;
    }

}
