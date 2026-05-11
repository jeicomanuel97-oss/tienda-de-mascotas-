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
public class Cliente extends Usuario{
    private ArrayList<Pedido> pedido;

    public Cliente(String nombre, int Id, String correo, String contraseña) {
        super(nombre , Id ,correo,contraseña );
        this.pedido = new ArrayList<>();
    }

    public void agregarPedido(Pedido p){
        pedido.add(p);
        
    }
    public void verPedido(){
        for(Pedido p : pedido){
          System.out.println(p);  
        }
         
        
    }
    public ArrayList<Pedido> getPedido(){
        return pedido;
    }
    public void mostrarPedidos(){
    for(Pedido p : pedido){
        System.out.println(p.getTotal());
    }   
}
}
