/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import interfaces.EsAlimento;
import java.time.LocalDate;

/**
 *
 * @author ivantorale
 */
public class Cereales implements EsAlimento{
    
    private String marca;
    private double precio;
    private String tipoCereal;
    private int calorias;
    private LocalDate caducidad;
    
    public Cereales(String marca, double precio, String tipoCereal,int calorias,LocalDate caducidad) {
        this.marca = marca;
        this.precio = precio;
        this.tipoCereal = tipoCereal;
        this.calorias = calorias;
        this.caducidad = caducidad;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipoCereal() {
        return tipoCereal;
    }

    public void setTipoCereal(String tipoCereal) {
        this.tipoCereal = tipoCereal;
    }
    
    @Override
    public void setCaducidad(LocalDate caducidad) {
        this.caducidad = caducidad;
    }

    @Override
    public LocalDate getCaducidad() {
        return this.caducidad;
    }
    
    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    @Override
    public int getCalorias() {
        return this.calorias;
    }
    
    private int tipoCereal() {
        switch (this.tipoCereal) {
            case "espelta":
                return 5;
            case "maíz":
                return 8;
            case "trigo":
                return 12;
            default:
                return 15;
        }
    }

    @Override
    public String toString() {
        return "Caja de cereales " + this.marca + " - Tipo de cereal: " + this.tipoCereal + " - Precio: $" + this.precio + " - Calorías: " + this.calorias + " - Caducidad: " + this.caducidad;
    }

    
    
}
