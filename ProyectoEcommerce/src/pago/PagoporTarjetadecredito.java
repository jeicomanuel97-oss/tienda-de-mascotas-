/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pago;

/**
 *
 * @author HP
 */
public class PagoporTarjetadecredito extends Pago{
    public PagoporTarjetadecredito(double total) {
        super(total);
    }

    @Override
    public void pagar() {

        System.out.println("Pago realizado con tarjeta");
        System.out.println("Total pagado: " + total);

    }
    
}
