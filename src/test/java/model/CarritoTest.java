package model;
import Exceptions.clienteNoValidoException;
import Exceptions.idNoValidoException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CarritoTest {

    @Test
    // camino feliz Carrito valido
    void carritoValido(){

        Carrito carrito = Carrito.newCarrito(1,"Camila Quinteros","Azucar",3,1500,1200);

        assertEquals(1,carrito.getId());
        assertEquals("Camila Quinteros",carrito.getCliente());
        assertEquals("Azucar",carrito.getProducto());
        assertEquals(3,carrito.getCantProducto());
        assertEquals(1500,carrito.getSubTotal());
        assertEquals(1200,carrito.getTotal());
    }
    @Test
    void carritoSinId(){
        assertThrows(idNoValidoException.class,
                () -> Carrito.newCarrito (0,"Camila Quinteros","Azucar",3,1500,1200));
    }

    @Test
    void carritoSinCliente(){
        assertThrows(clienteNoValidoException.class,
                () -> Carrito.newCarrito (1,null,"Azucar",3,1500,1200));
    }

    // @Test
    //camino feliz
    // camino infeliz


}
