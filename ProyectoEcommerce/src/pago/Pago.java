/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pago;

/**
 *
 * @author HP
 */
public abstract class Pago {
     protected double total;

    public Pago(double total) {
        this.total = total;
    }

    public abstract void pagar();
    
    
}
