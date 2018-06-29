package model;

import excepciones.UsuarioInvalidoException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Data {

    private final Conexion con;
    private String query;
    private ResultSet rs;


    public Data() throws ClassNotFoundException, SQLException {
        con = new Conexion("localhost", "aqui va el nombre de la bd", "root", "");
    }


    public void errorUsuarioInvalido() throws UsuarioInvalidoException{
        String mensaje="El nombre y/o clave ingresadas son invalidas";
        UsuarioInvalidoException ue= new UsuarioInvalidoException(mensaje);
    }
    
    
   
}
