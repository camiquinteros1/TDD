package model;

import Exceptions.*;

public class Producto {
    private int id;
    private double precio;
    private String nombre;
    private String descripcion;
    private int stock;


    private Producto(int id,double precio,String nombre,String descripcion,int stock){
        this.id = id;
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.stock = stock;

    }

    public static Producto newProducto(int id,double precio,String nombre,String descripcion,int stock){
        if(id <= 0){
            throw new idNoValidoException("El id tiene que ser mayor a cero");
        }
        if(precio < 0){
            throw new productoConPrecioNegativoException("El precio no puede ser negativo");
        }
        if(nombre == null || nombre.isBlank()){
            throw new productoSinNombreException("El nombre del producto es obligatorio");

        }
        if(nombre.length()<3||nombre.length()>50){
            throw new NombreProductoNoValidoException("El nombre debe tener entre 3 y 50 caracteres");
        }
        if (stock < 0){
            throw new productoConStockNegativoException("El stock no puede ser negativo");
        }

        return new Producto(id,precio,nombre,descripcion,stock);


    }
    //solo con atributos obligatorios
    public static Producto newProducto(int id,double precio,String nombre){
        return newProducto(id,precio,nombre,null,0);
    }

    public int getId(){
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getStock() {
        return stock;
    }
}
