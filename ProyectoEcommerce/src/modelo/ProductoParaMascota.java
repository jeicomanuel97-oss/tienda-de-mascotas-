/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;



/**
 *
 * @author HP
 */
public class ProductoParaMascota {
    private int id;
    private String nombre;
    private double precio;
    private int stock;

    public ProductoParaMascota(int id, String nombre, double precio, int stock) {
       
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }
    

    public int getId() {
        return id;
    }
    

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }
     public void reducirStock(int cantidad) {
        this.stock -= cantidad;
    }

    public void aumentarStock(int cantidad) {
        this.stock += cantidad;
    }

}
