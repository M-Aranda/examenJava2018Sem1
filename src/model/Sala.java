
package model;

/**
 *
 * @author Marce
 */
public class Sala {
    
    
    private int id;
    private String nombre;
    private int cantidadDeLamparasInstaladas;
    private int tempEnGradosCelsiusDeLaSala;
    private boolean tieneCierreCentralizado;
    private boolean tieneAlarmaContraIncendios;
    private EncargadoDeSala encargadoDeSala;

    public Sala(int id, String nombre, int cantidadDeLamparasInstaladas, int tempEnGradosCelsiusDeLaSala, boolean tieneCierreCentralizado, boolean tieneAlarmaContraIncendios, EncargadoDeSala encargadoDeSala) {
        this.id = id;
        this.nombre = nombre;
        this.cantidadDeLamparasInstaladas = cantidadDeLamparasInstaladas;
        this.tempEnGradosCelsiusDeLaSala = tempEnGradosCelsiusDeLaSala;
        this.tieneCierreCentralizado = tieneCierreCentralizado;
        this.tieneAlarmaContraIncendios = tieneAlarmaContraIncendios;
        this.encargadoDeSala = encargadoDeSala;
    }

    public Sala() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadDeLamparasInstaladas() {
        return cantidadDeLamparasInstaladas;
    }

    public void setCantidadDeLamparasInstaladas(int cantidadDeLamparasInstaladas) {
        this.cantidadDeLamparasInstaladas = cantidadDeLamparasInstaladas;
    }

    public int getTempEnGradosCelsiusDeLaSala() {
        return tempEnGradosCelsiusDeLaSala;
    }

    public void setTempEnGradosCelsiusDeLaSala(int tempEnGradosCelsiusDeLaSala) {
        this.tempEnGradosCelsiusDeLaSala = tempEnGradosCelsiusDeLaSala;
    }

    public boolean isTieneCierreCentralizado() {
        return tieneCierreCentralizado;
    }

    public void setTieneCierreCentralizado(boolean tieneCierreCentralizado) {
        this.tieneCierreCentralizado = tieneCierreCentralizado;
    }

    public boolean isTieneAlarmaContraIncendios() {
        return tieneAlarmaContraIncendios;
    }

    public void setTieneAlarmaContraIncendios(boolean tieneAlarmaContraIncendios) {
        this.tieneAlarmaContraIncendios = tieneAlarmaContraIncendios;
    }

    public EncargadoDeSala getEncargadoDeSalafk() {
        return encargadoDeSala;
    }

    public void setEncargadoDeSalafk(EncargadoDeSala encargadoDeSala) {
        this.encargadoDeSala = encargadoDeSala;
    }

    @Override
    public String toString() {
        return  nombre;
    }
    
    
    
}
