/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import interfaces.EsLiquido;

/**
 *
 * @author ivantorale
 */
public class Detergente implements EsLiquido {

    private String marca;
    private double precio;
    private double descuento;
    private double volumen;
    private String tipoEnvase;

    public Detergente(String marca, double precio,double descuento,double volumen,String tipoEnvase) {
        this.marca = marca;
        this.precio = precio;
        this.descuento = 0;
        this.volumen = volumen;
        this.tipoEnvase = tipoEnvase;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getDescuento() {
        return this.descuento;
    }

    @Override
    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    @Override
    public double getVolumen() {
        return this.volumen;
    }

    @Override
    public void setTipoEnvase(String tipoEnvase) {
        this.tipoEnvase = tipoEnvase;
    }

    @Override
    public String getTipoEnvase() {
        return this.tipoEnvase;
    }

    @Override
    public String toString() {
        String descuentoStr = (this.descuento > 0) ? " (descuento del " + this.descuento + "%)" : "";
        String volumenStr = (this.volumen > 0) ? " de " + this.volumen + " litros" : "";
        String tipoEnvaseStr = (this.tipoEnvase != null) ? " en envase de " + this.tipoEnvase : "";

        return "Botella de detergente " + this.marca + descuentoStr + volumenStr + tipoEnvaseStr + " - Precio: $" + this.precio;
    }
}
