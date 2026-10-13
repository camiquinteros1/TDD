package Exceptions;

public class nombreClienteNoValidoException extends RuntimeException {
    public nombreClienteNoValidoException(String mensaje) {
        super(mensaje);
    }
}
