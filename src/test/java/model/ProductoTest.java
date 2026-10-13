package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Exceptions.*;

public class ProductoTest {

    @Test
    void productoValido(){

        Producto producto = Producto.newProducto(1,1200,"lavandina","Limpiador Multiuso",100);

        assertEquals(1,producto.getId());
        assertEquals(1200,producto.getPrecio());
        assertEquals("lavandina",producto.getNombre());
        assertEquals("Limpiador Multiuso",producto.getDescripcion());
        assertEquals(100,producto.getStock());
    }

    @Test
    void productoValidoSoloAtributosObligatorios(){
        Producto producto = Producto.newProducto(1,1200,"lavandina");
        assertEquals(1,producto.getId());
        assertEquals(1200,producto.getPrecio());
        assertEquals("lavandina",producto.getNombre());
        //valores NO obligatorios asumen valores por defecto
        assertNull(producto.getDescripcion());
        assertEquals(0,producto.getStock());


    }

    @Test
    void productoSinIdLanzaException(){
        assertThrows(idNoValidoException.class,
                () -> Producto.newProducto(0,1200,"lavandina","Limpiador Multiuso",100));
    }
    @Test
    void productoSinNombreLanzaException(){
        assertThrows(productoSinNombreException.class,
                () -> Producto.newProducto(1,1200," ","Limpiador Multiuso",100));

    }
    @Test
    void productoPrecioNegativoLanzaException(){
        assertThrows(productoConPrecioNegativoException.class,
                () -> Producto.newProducto(1,-1200,"lavandina","Limpiador Multiuso",100));
    }
    @Test
    void productoStockNegativoLanzaException(){
        assertThrows(productoConStockNegativoException.class,
                ()->Producto.newProducto(1,1200,"lavandina","Limpiador Multiuso",-100));

    }

    @Test
    void nombreProductoNoValido(){
        assertThrows(NombreProductoNoValidoException.class,
                ()->Producto.newProducto(1,1200,"la","Limpiador Multiuso",100));
    }

}
