
package excepciones;

public class UsuarioInvalidoException extends Exception {


    public UsuarioInvalidoException() {
    }

    public UsuarioInvalidoException(String msg) {
        super(msg);
    }
}
