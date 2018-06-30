package model;

import interfases.Tamaneable;

/**
 *
 * @author Marce
 */
public class Tamanio implements Tamaneable {

    private int id;
    private int alto;
    private int ancho;

    public Tamanio(int id, int ancho, int alto) {
        this.id = id;
        this.alto = alto;
        this.ancho = ancho;
    }

    public Tamanio() {
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getAncho() {
        return this.ancho;
    }

    @Override
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    @Override
    public int getAlto() {
        return this.alto;
    }

    @Override
    public void setAlto(int alto) {
        this.alto = alto;
    }

}
