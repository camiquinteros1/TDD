package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Exceptions.*;

public class ClienteTest {

    @Test
    void clienteValido() {
        //id,nombre,edad,mail,telefono,direccion
        Cliente cliente = Cliente.newCliente(1, "Camila", 21, "Cami@mail.com", "123", "calle 123");

        assertEquals(1, cliente.getId());
        assertEquals("Camila", cliente.getNombre());
        assertEquals(21, cliente.getEdad());
        assertEquals("Cami@mail.com", cliente.getEmail());
        assertEquals("123", cliente.getTelefono());
        assertEquals("calle 123", cliente.getDireccion());
    }
    @Test
    void clienteValidoSoloConAtributosObligatorios(){
         Cliente cliente = Cliente.newCliente(1,"Camila",21,"Cami@mail.com");

         assertEquals(1,cliente.getId());
         assertEquals("Camila",cliente.getNombre());
         assertEquals(21,cliente.getEdad());
         assertEquals("Cami@mail.com",cliente.getEmail());

         assertNull(cliente.getTelefono());
         assertNull(cliente.getDireccion());
    }

    @Test
    void clienteSinIdLanzaException(){
        assertThrows(idNoValidoException.class,
                () -> Cliente.newCliente(0,"Camila",21,"Cami@mail.com","123","calle 123"));
    }


    @Test
    void clienteNombreNullLanzaException(){
        assertThrows(nombreClienteNoValidoException.class,
                ()->Cliente.newCliente(1,null,21,"Cami@mail.com","123","calle 123"));

    }
    @Test
    void clienteNombreVacioLanzaException(){
        assertThrows(nombreClienteNoValidoException.class,
                () -> Cliente.newCliente(1," ",21,"Cami@mail.com","123","calle 123"));
    }
    @Test
    void clienteConNombreDeUnSoloCaracterLanzaException(){
        assertThrows(nombreClienteNoValidoException.class,
                ()->Cliente.newCliente(1,"c",21,"Cami@mail.com","123","calle 123"));

    }
    @Test
    void clienteConNombreDeCincuentaCaracteresValido(){
        Cliente cliente = Cliente.newCliente(1,"c".repeat(50),21,"Cami@mail.com","123","calle 123");

        assertEquals(50,cliente.getNombre().length());
    }
    @Test
    void clienteConNombreLargoLanzaException(){
        assertThrows(nombreClienteNoValidoException.class,
                ()->Cliente.newCliente(1,"c".repeat(51),21,"Cami@mail.com","123","calle 123"));

    }


    @Test
    void clienteConMailSinArrobaLanzaException(){
        assertThrows(emailNoValidoException.class,
                ()->Cliente.newCliente(1,"camila",21,"camimail.com","123","calle 123"));
    }
    @Test
    void clienteConMailSinPuntoLanzaException(){
        assertThrows(emailNoValidoException.class,
                () -> Cliente.newCliente(1,"camila",21,"cami@mail","123","calle 123"));

    }
    @Test
    void clienteConMailNullLanzaException(){
        assertThrows(emailNoValidoException.class,
                ()->Cliente.newCliente(1,"camila",21,null,"123","calle 123"));
    }




}
