package Exceptions;

public class productoSinNombreException extends RuntimeException {
    public productoSinNombreException(String mensaje) {
        super(mensaje);
    }
}
