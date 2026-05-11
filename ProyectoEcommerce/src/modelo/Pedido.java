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
public class Pedido {
    private int id;
    private ArrayList<ProductoParaMascota>productos;
    private double total;
    private String estado;
    public Pedido (int id, double total, String estado){
        this.id=id;
        this.total=total;
        this.estado=estado;
        this.productos= new ArrayList<>();
        
    }
      public void agregarProducto(ProductoParaMascota p){
        productos.add(p);
      }
       public double getTotal(){
        return total;
       }
      public double calcularTotal(){
          double suma=0;
          for(ProductoParaMascota p:productos){
              suma+= p.getPrecio();
          }
          total=suma;
          return total;
      }
      public void confirmarPedido(){
    estado = "Confirmado";
    System.out.println("Pedido confirmado correctamente");
}
}
