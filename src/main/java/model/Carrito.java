package model;
import Exceptions.*;

public class Carrito {

    // atributos
    private int id;
    private String cliente;
    private String producto;
    private int cantProducto;
    private double subTotal;
    private double total;

    //constructor
    private Carrito (int id,String cliente,String producto,int cantProducto,double subTotal,double total){
     this.id = id;
     this.cliente = cliente;
     this.producto = producto;
     this.cantProducto = cantProducto;
     this.subTotal = subTotal;
     this.total = total;
    }

    //metodo crear
    public static Carrito newCarrito(int id, String cliente,String producto,int cantProduct,double subTotal,double total){
        if(id <= 0){
            throw new idNoValidoException("El id tiene que ser mayor a cero");
        }
        if (cliente == null || cliente.isBlank()){
            throw new clienteNoValidoException("El nombre del cliente es obligatorio");
        }
        if(producto == null){
            throw new productoNoValidoException("El producto es obligatorio");
        }
        if(cantProduct <= 0){
            throw new cantidadNoValidaException("La cantidad tiene que ser mayor a cero");
        }
        if (subTotal < 0){
            throw new subTotalNoValidoException("El subtotal no puede ser negativo");
        }
        if(total < 0){
            throw new totalNoValidoException("El total no puede ser negativo");
        }
        return new Carrito(id,cliente,producto,cantProduct,subTotal,total);

    }

    public int getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public String getProducto() {
        return producto;
    }

    public int getCantProducto() {
        return cantProducto;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public double getTotal() {
        return total;
    }

    // newCarrito(atributos)
        // Validaciones con if y exepciones
}
