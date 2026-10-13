package Exceptions;

public class emailNoValidoException extends RuntimeException {
    public emailNoValidoException(String mensaje) {
        super(mensaje);
    }
}
