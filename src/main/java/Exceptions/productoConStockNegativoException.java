package Exceptions;

public class productoConStockNegativoException extends RuntimeException {
    public productoConStockNegativoException(String mensaje) {
        super(mensaje);
    }
}
