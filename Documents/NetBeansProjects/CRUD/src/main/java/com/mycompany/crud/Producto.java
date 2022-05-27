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
    
    public String getProduct(){
        return Nombre;
    }
    public void setProduct(String Nombre){
        this.Nombre = Nombre;
    }
    
    public String getuom(){
        return Apellido;
    }
    public void setuom(String Apellido){
        this.Apellido = Apellido;
    }
    
    public String getquantity() {
        return Direccion;
    }
    public void setquantity(String direccion) {
        this.Direccion = direccion;
    }
    
    public String getprice() {
        return Telefono;
    }
    public void setprice(String telefono) {
        this.Telefono = telefono;
    }
    
}
