/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import java.util.ArrayList;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import modelo.ProductoParaMascota;
/**
 *
 * @author HP
 */
public class GestorDeDatos {
    private ArrayList<ProductoParaMascota>producto;
   public GestorDeDatos(){
     this.producto=new ArrayList<>();  
   }
     
     public void guardarProductos(){
          try {
         FileWriter archivo = new FileWriter("productos.txt");
         BufferedWriter bm=new BufferedWriter(archivo);
         for(ProductoParaMascota p : producto){
           bm.write(
                    p.getId() + "," +
                    p.getNombre() + "," +
                    p.getPrecio() + "," +
                    p.getStock()
           
           );
           bm.newLine();
         }
       bm.close();
              System.out.println("producto guardado");
     
} catch(IOException e){
              System.out.println("Error pai no guardastes el producto");
    
}
     }
     
} 
