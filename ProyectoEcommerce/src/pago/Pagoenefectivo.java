/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pago;

/**
 *
 * @author HP
 */
public class Pagoenefectivo extends Pago{
    public Pagoenefectivo(double total ){
        super(total);
        
    }
     @Override
    public void pagar() {

        System.out.println("Pago realizado en efectivo");
        System.out.println("Total pagado: " + total);

    }
}
