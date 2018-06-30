package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Data {

    private final Conexion con;
    private String query;
    private ResultSet rs;

    public Data() throws ClassNotFoundException, SQLException {
        con = new Conexion("localhost", "obrasMuseo", "root", "");
    }

    public List<Autor> getAutores() throws SQLException {
        List<Autor> autores = new ArrayList();

        query = "SELECT * FROM autor";

        rs = con.ejecutarSelect(query);

        while (rs.next()) {

            int id = rs.getInt(1);
            String nombre = rs.getString(2);
            String apellido = rs.getString(3);
            String rut = rs.getString(4);
            String nacionalidad = rs.getString(5);

            Autor a = new Autor(apellido, nacionalidad, id, nombre, rut);

            autores.add(a);
        }

        return autores;

    }

    public List<Tecnica> getTecnicas() throws SQLException {
        List<Tecnica> tecnicas = new ArrayList();

        query = "SELECT * FROM tecnica";

        rs = con.ejecutarSelect(query);

        while (rs.next()) {

            int id = rs.getInt(1);
            String nombre = rs.getString(2);

            Tecnica t = new Tecnica(id, nombre);

            tecnicas.add(t);
        }

        return tecnicas;

    }

    public List<Genero> getGeneros() throws SQLException {
        List<Genero> generos = new ArrayList();

        query = "SELECT * FROM genero";

        rs = con.ejecutarSelect(query);

        while (rs.next()) {

            int id = rs.getInt(1);
            String nombre = rs.getString(2);

            Genero g = new Genero(id, nombre);

            generos.add(g);
        }

        return generos;

    }

    public List<Sala> getSalas() throws SQLException {
        List<Sala> salas = new ArrayList();

        query = "SELECT * FROM sala";

        rs = con.ejecutarSelect(query);

        while (rs.next()) {
            int id = rs.getInt(1);
            String nombre = rs.getString(2);
            int cantLamp = rs.getInt(3);
            int cantGrados = rs.getInt(4);
            boolean tieneCierreCentralizado = rs.getBoolean(5);
            boolean tieneAlarmaContraIncendios = rs.getBoolean(6);
            int encargadoDeSalafk = rs.getInt(7);

            Sala s = new Sala(id, nombre, cantLamp, cantGrados,
                    tieneCierreCentralizado, tieneAlarmaContraIncendios, encargadoDeSalafk);

            salas.add(s);

        }

        return salas;
    }

    public List<Obra> getObras() throws SQLException {
        List<Obra> obras = new ArrayList();

        query = "SELECT * FROM obra";

        rs = con.ejecutarSelect(query);

        while (rs.next()) {
            int id = rs.getInt(1);
            int autor = rs.getInt(2);
            int tecnica = rs.getInt(3);
            int genero = rs.getInt(4);
            int anioCreacion = rs.getInt(5);
            String nombrePintura = rs.getString(6);
            int tamanio_fk = rs.getInt(7);
            int ubicacion = rs.getInt(8);

            Obra o = new Obra(id, autor, tecnica, genero, anioCreacion, nombrePintura, tamanio_fk, ubicacion);

            obras.add(o);

        }

        return obras;
    }

    public Obra getObra(int id) throws SQLException {
        Obra o = new Obra();
        query = "SELECT * FROM obra WHERE id=" + id + "";

        rs = con.ejecutarSelect(query);

        while (rs.next()) {
            o.setId(rs.getInt(1));
            o.setAutor_fk(rs.getInt(2));
            o.setTecnica_fk(rs.getInt(3));
            o.setGenero_fk(rs.getInt(4));
            o.setAnioDeCreacion(rs.getInt(5));
            o.setNombreDeObra(rs.getString(6));
            o.setTamanio_fk(rs.getInt(7));
            o.setUbicacion(rs.getInt(8));

        }

        return o;
    }

    public void eliminarObra(int id) throws SQLException {
        query = "DELETE FROM obra WHERE id=" + id + "";
        con.ejecutar(query);
    }

    public List<Obra> getObrasPorSala(int idDeSala) throws SQLException {
        List<Obra> obras = new ArrayList();

        query = "SELECT * FROM obra WHERE ubicacion=" + idDeSala + "";

        rs = con.ejecutarSelect(query);

        while (rs.next()) {
            int id = rs.getInt(1);
            int autor = rs.getInt(2);
            int tecnica = rs.getInt(3);
            int genero = rs.getInt(4);
            int anioCreacion = rs.getInt(5);
            String nombrePintura = rs.getString(6);
            int tamanio_fk = rs.getInt(7);
            int ubicacion = rs.getInt(8);

            Obra o = new Obra(id, autor, tecnica, genero, anioCreacion, nombrePintura, tamanio_fk, ubicacion);

            obras.add(o);

        }

        return obras;
    }

    public Tamanio getTamanio(int idTamanio) throws SQLException {
        Tamanio t = new Tamanio();

        query = "SELECT * FROM tamanio WHERE id=" + idTamanio + "";

        rs = con.ejecutarSelect(query);

        while (rs.next()) {
            t.setId(rs.getInt(1));
            t.setAlto(rs.getInt(2));
            t.setAncho(rs.getInt(3));
        }

        return t;
    }

    public void crearTamanio(int ancho, int alto) throws SQLException {
        query = "INSERT INTO tamanio VALUES (NULL, " + ancho + "," + alto + ")";
        con.ejecutar(query);

    }

    public int obtenerIdTamanioMasReciente() throws SQLException {
        query = "SELECT MAX(id) FROM tamanio";
        int idTamanio = 0;

        rs = con.ejecutarSelect(query);
        while (rs.next()) {
            idTamanio = rs.getInt(1);

        }

        return idTamanio;

    }

    public void registrarObra(int autor, int tecnica, int genero, int anioCreacion, String nombrePintura, int idTamanio, int ubicacion) throws SQLException {

        query = "INSERT INTO obra VALUES(NULL," + autor + "," + tecnica + ", " + genero + ", "
                + "" + anioCreacion + ", '" + nombrePintura + "' ," + idTamanio + ", " + ubicacion + ")";

        con.ejecutar(query);
    }

}
