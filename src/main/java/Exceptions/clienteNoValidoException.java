package Exceptions;

public class clienteNoValidoException extends RuntimeException {
    public clienteNoValidoException(String message) {
        super(message);
    }
}
