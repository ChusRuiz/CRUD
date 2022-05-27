/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crud;

/**
 *
 * @author GAMING
 */
public class Producto {
    
    private int Id;
    private String Nombre;
    private String Apellido;
    private String Direccion;
    private String Telefono;
    
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        this.Id = id;
    }
    
    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    
    public String getApellido(){
        return Apellido;
    }
    public void setApellido(String Apellido){
        this.Apellido = Apellido;
    }
    
    public String getDireccion() {
        return Direccion;
    }
    public void setDireccion(String direccion) {
        this.Direccion = direccion;
    }
    
    public String getTelefono() {
        return Telefono;
    }
    public void setTelefono(String telefono) {
        this.Telefono = telefono;
    }
    
}
