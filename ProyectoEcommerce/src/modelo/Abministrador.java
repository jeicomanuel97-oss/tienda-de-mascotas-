/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Abministrador extends Usuario{
    
    public Abministrador(String nombre, int Id, String correo, String contraseña) {
        super(nombre, Id,correo,contraseña);
    }
    
    public void agregarProducto(ArrayList<ProductoParaMascota> productos, ProductoParaMascota p) {
        productos.add(p);
        System.out.println("Producto agregado correctamente");
    }

   
    public void eliminarProducto(ArrayList<ProductoParaMascota> productos, ProductoParaMascota p) {
        productos.remove(p);
        System.out.println("Producto eliminado correctamente");
    }

  
    public void mostrarProductos(ArrayList<ProductoParaMascota> productos) {

        for (ProductoParaMascota p : productos) {

           System.out.println("ID: " + p.getId());
           System.out.println("Nombre: " + p.getNombre());
            System.out.println("Precio: " + p.getPrecio());
            System.out.println("Stock: " + p.getStock());
            System.out.println("----------------------");
        }
    }
}



