/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author HP
 */
public class Usuario {
    private String nombre;
    private int Id;
    private String correo;
    private String contraseña;

    public Usuario(String nombre, int Id, String correo, String contraseña) {
        this.nombre = nombre;
        this.Id = Id;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return Id;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContraseña() {
        return contraseña;
    }
    

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public boolean login(String correo,String contraseña) {
         return this.correo.equals(correo)&& this.contraseña.equals(contraseña);
    }

    public void logout() { 
        System.out.println("Esta Seccion esta Cerrada");
    }

    
}
