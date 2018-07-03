package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Data {

    private final Conexion con;
    private String query;
    private ResultSet rs;
    private ResultSet rsEncargadoDeSala;

    private ResultSet rsTecnica;
    private ResultSet rsGenero;
    private ResultSet rsTamanio;
    private ResultSet rsSala;
    private ResultSet rsAutor;
    //necesito varios ResultSet para poder obtener mas de un resultado en metodos con consultas multiples

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

        //por alguna razon no hace el next si descomento el metodo getEncargado Y declaro estas variables
        while (rs.next()) {
            int id = rs.getInt(1);
            String nombre = rs.getString(2);
            int cantLamp = rs.getInt(3);
            int cantGrados = rs.getInt(4);
            boolean tieneCierreCentralizado = rs.getBoolean(5);
            boolean tieneAlarmaContraIncendios = rs.getBoolean(6);
            int encargadoDeSalafk = rs.getInt(7);

            EncargadoDeSala e = getEncargadoDeSalaPorId(encargadoDeSalafk); //esto no se podia hacer. Por este metodo dentro del rs next que no avanzaba

            Sala s = new Sala(id, nombre, cantLamp, cantGrados,
                    tieneCierreCentralizado, tieneAlarmaContraIncendios, e);

            salas.add(s);

        }

        return salas;
    }

    public Sala getSalaPorId(int id) throws SQLException {

        query = "SELECT * FROM sala WHERE id=" + id + "";
        Sala s = new Sala();

        rsSala = con.ejecutarSelect(query);

        while (rsSala.next()) {
            int idSala = rsSala.getInt(1);
            String nombre = rsSala.getString(2);
            int cantLamp = rsSala.getInt(3);
            int cantGrados = rsSala.getInt(4);
            boolean tieneCierreCentralizado = rsSala.getBoolean(5);
            boolean tieneAlarmaContraIncendios = rsSala.getBoolean(6);
            int encargadoDeSalafk = rsSala.getInt(7);

            EncargadoDeSala e = getEncargadoDeSalaPorId(encargadoDeSalafk);

            s.setId(idSala);
            s.setNombre(nombre);
            s.setCantidadDeLamparasInstaladas(cantLamp);
            s.setTempEnGradosCelsiusDeLaSala(cantGrados);
            s.setTieneCierreCentralizado(tieneCierreCentralizado);
            s.setTieneAlarmaContraIncendios(tieneAlarmaContraIncendios);
            s.setEncargadoDeSalafk(e);

        }

        return s;

    }

    public EncargadoDeSala getEncargadoDeSalaPorId(int id) throws SQLException {

        query = "SELECT * FROM encargadoDeSala WHERE id=" + id + "";

        EncargadoDeSala e = new EncargadoDeSala("aaa", 1999, 2, "asd", "200");
        rsEncargadoDeSala = con.ejecutarSelect(query);
        while (rsEncargadoDeSala.next()) {

            int idEncargado = rsEncargadoDeSala.getInt(1);
            String nombre = rsEncargadoDeSala.getString(2);
            String rut = rsEncargadoDeSala.getString(3);
            String profesion = rsEncargadoDeSala.getString(4);
            int anioDeIngreso = rsEncargadoDeSala.getInt(5);

            e.setId(idEncargado);
            e.setNombre(nombre);
            e.setRut(rut);
            e.setProfesion(profesion);
            e.setAnioDeIngreso(anioDeIngreso);
        }

        return e;

    }

    public Autor getAutorPorId(int id) throws SQLException {

        query = "SELECT * FROM autor WHERE id=" + id + "";

        Autor a = new Autor("aaa", "aaa", 12, "aaa", "222");
        rsAutor = con.ejecutarSelect(query);
        while (rsAutor.next()) {

            int idAutor = rsAutor.getInt(1);
            String nombre = rsAutor.getString(2);
            String apellido = rsAutor.getString(3);
            String rut = rsAutor.getString(4);
            String nacionalidad = rsAutor.getString(5);

            a.setId(idAutor);
            a.setNombre(nombre);
            a.setApellido(apellido);
            a.setRut(rut);
            a.setNacionalidad(nacionalidad);

        }

        return a;

    }

    public Tecnica getTecnicaPorId(int id) throws SQLException {

        query = "SELECT * FROM tecnica WHERE id=" + id + "";

        Tecnica t = new Tecnica(1, "mhh");
        rsTecnica = con.ejecutarSelect(query);

        while (rsTecnica.next()) {

            int idTecnica = rsTecnica.getInt(1);
            String nombreTecnica = rsTecnica.getString(2);

            t.setId(idTecnica);
            t.setNombre(nombreTecnica);

        }

        return t;

    }

    public Genero getGeneroPorId(int id) throws SQLException {

        query = "SELECT * FROM genero WHERE id=" + id + "";

        Genero g = new Genero(1, "mhh");
        rsGenero = con.ejecutarSelect(query);

        while (rsGenero.next()) {

            int idGenero = rsGenero.getInt(1);
            String nombreGenero = rsGenero.getString(2);

            g.setId(idGenero);
            g.setNombre(nombreGenero);

        }

        return g;

    }

    public List<Obra> getObras() throws SQLException {
        List<Obra> obras = new ArrayList();

        query = "SELECT * FROM obra";

        rs = con.ejecutarSelect(query);

        while (rs.next()) {
            int id = rs.getInt(1);
            int autorFk = rs.getInt(2);
            int tecnicaFk = rs.getInt(3);
            int generoFk = rs.getInt(4);
            int anioCreacion = rs.getInt(5);
            String nombrePintura = rs.getString(6);
            int tamanio_fk = rs.getInt(7);
            int ubicacion = rs.getInt(8);

            Autor autor = getAutorPorId(autorFk);
            Tecnica tecnica = getTecnicaPorId(tecnicaFk);
            Genero genero = getGeneroPorId(generoFk);
            Tamanio tamanio = getTamanioPorId(tamanio_fk);
            Sala sala = getSalaPorId(ubicacion);

            Obra o = new Obra(id, autor, tecnica, genero, anioCreacion, nombrePintura, tamanio, sala);

            obras.add(o);

        }

        return obras;
    }

    public Obra getObra(int id) throws SQLException {
        Obra o = new Obra();
        query = "SELECT * FROM obra WHERE id=" + id + "";

        rs = con.ejecutarSelect(query);

        while (rs.next()) {
            int idObra = rs.getInt(1);
            int autorFk = rs.getInt(2);
            int tecnicaFk = rs.getInt(3);
            int generoFk = rs.getInt(4);
            int anioCreacion = rs.getInt(5);
            String nombrePintura = rs.getString(6);
            int tamanio_fk = rs.getInt(7);
            int ubicacion = rs.getInt(8);

            Autor autor = getAutorPorId(autorFk);
            Tecnica tecnica = getTecnicaPorId(tecnicaFk);
            Genero genero = getGeneroPorId(generoFk);
            Tamanio tamanio = getTamanioPorId(tamanio_fk);
            Sala sala = getSalaPorId(ubicacion);

            o.setId(idObra);
            o.setAutor(autor);
            o.setTecnica(tecnica);
            o.setGenero(genero);
            o.setAnioDeCreacion(anioCreacion);
            o.setNombreDeObra(nombrePintura);
            o.setTamanio(tamanio);
            o.setUbicacion(sala);

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
            int autorFk = rs.getInt(2);
            int tecnicaFk = rs.getInt(3);
            int generoFk = rs.getInt(4);
            int anioCreacion = rs.getInt(5);
            String nombrePintura = rs.getString(6);
            int tamanio_fk = rs.getInt(7);
            int ubicacion = rs.getInt(8);

            Autor autor = getAutorPorId(autorFk);
            Tecnica tecnica = getTecnicaPorId(tecnicaFk);
            Genero genero = getGeneroPorId(generoFk);
            Tamanio tamanio = getTamanioPorId(tamanio_fk);
            Sala sala = getSalaPorId(ubicacion);

            Obra o = new Obra(id, autor, tecnica, genero, anioCreacion, nombrePintura, tamanio, sala);

            obras.add(o);

        }

        return obras;
    }

    public Tamanio getTamanioPorId(int idTamanio) throws SQLException {
        Tamanio t = new Tamanio();

        query = "SELECT * FROM tamanio WHERE id=" + idTamanio + "";

        rsTamanio = con.ejecutarSelect(query);

        while (rsTamanio.next()) {
            t.setId(rsTamanio.getInt(1));
            t.setAlto(rsTamanio.getInt(2));
            t.setAncho(rsTamanio.getInt(3));
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

    public void registrarObra(Obra obra) throws SQLException {

        query = "INSERT INTO obra VALUES(NULL," + obra.getAutor().getId() + "," + obra.getTecnica().getId() + ", " + obra.getGenero().getId() + ", "
                + "" + obra.getAnioDeCreacion() + ", '" + obra.getNombreDeObra() + "' ," + obra.getTamanio().getId() + ", " + obra.getUbicacion().getId() + ")";

        con.ejecutar(query);
    }

}
