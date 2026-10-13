package Exceptions;

public class NombreProductoNoValidoException extends RuntimeException {
    public NombreProductoNoValidoException(String mensaje) {
        super(mensaje);
    }
}
