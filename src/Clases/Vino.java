/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author ivantorale
 */
public class Vino {
    
    private String marca;
    private String tipoDeVino;
    private double gradosDeAlcohol;
    private double precio;

    public Vino(String marca, String tipoDeVino, double gradosDeAlcohol, double precio) {
        this.marca = marca;
        this.tipoDeVino = tipoDeVino;
        this.gradosDeAlcohol = gradosDeAlcohol;
        this.precio = precio;
    }

    public double getDescuento() {
        return precio % 10;
    }

    public double getCalorias() {
        return gradosDeAlcohol * 10;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoDeVino() {
        return tipoDeVino;
    }

    public void setTipoDeVino(String tipoDeVino) {
        this.tipoDeVino = tipoDeVino;
    }

    public double getGradosDeAlcohol() {
        return gradosDeAlcohol;
    }

    public void setGradosDeAlcohol(double gradosDeAlcohol) {
        this.gradosDeAlcohol = gradosDeAlcohol;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "BotellaDeVino{" +
                "marca='" + marca + '\'' +
                ", tipoDeVino='" + tipoDeVino + '\'' +
                ", gradosDeAlcohol=" + gradosDeAlcohol +
                ", precio=" + precio +
                '}';
    }
}
