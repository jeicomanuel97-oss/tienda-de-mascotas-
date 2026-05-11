/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.util.ArrayList;
import modelo.Pedido;
import modelo.ProductoParaMascota;

/**
 *
 * @author HP
 */
public class CarritoCompraMascota {
    private ArrayList<ProductoParaMascota>productos;
    public CarritoCompraMascota(){
        this.productos= new ArrayList<>();
    }
     public void agregarProducto(ProductoParaMascota p){
        productos.add(p);
        
}
     public double calcularTotal(){
          double suma=0;
          for(ProductoParaMascota p:productos){
              suma+= p.getPrecio();
              
          }
          return suma;
}
     public void eliminarProducto(ProductoParaMascota p){
         productos.remove(p);
     }
     public Pedido generarPedido(int idPedido){
         double total =calcularTotal();
         Pedido pedido= new Pedido( idPedido,total,"Pendiente");
         for(ProductoParaMascota p:productos){
             pedido.agregarProducto(p);
         }
           productos.clear();
         return pedido;
     }
}
