package model;
import Exceptions.*;

public class Cliente {
    private int id;
    private String nombre;
    private int edad;
    private String email;
    private String telefono;
    private String direccion;

    private Cliente(int id,String nombre,int edad,String email,String telefono,String direccion){
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public static Cliente newCliente(int id,String nombre,int edad,String email,String telefono,String direccion){

        if (id <= 0) {
            throw new idNoValidoException("El id tiene que ser mayor a cero");
        }
        if (nombre == null || nombre.isBlank()) {
            throw new nombreClienteNoValidoException("El nombre es obligatorio");
        }
        if (nombre.length() < 2 || nombre.length() > 50) {
            throw new nombreClienteNoValidoException("El nombre debe tener entre 2 y 50 caracteres");
        }
        if (email == null || email.indexOf('@') < 0
                || !email.substring(email.indexOf('@')).contains(".")) {
            throw new emailNoValidoException("El email debe tener @ y un punto después del @");
        }

        return new Cliente(id, nombre, edad, email, telefono, direccion);
    }

    public static Cliente newCliente(int id,String nombre,int edad,String email){
        return newCliente(id,nombre,edad,email,null,null);
    }

    public int getId(){
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }
}
