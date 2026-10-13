package Exceptions;

public class productoConPrecioNegativoException extends RuntimeException {
    public productoConPrecioNegativoException(String mensaje) {
        super(mensaje);
    }
}
