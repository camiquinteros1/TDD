package Exceptions;

public class productoNoValidoException extends RuntimeException {
    public productoNoValidoException(String message) {
        super(message);
    }
}
