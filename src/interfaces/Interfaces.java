/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaces;

import Clases.Cereales;
import Clases.Detergente;
import Clases.Vino;
import java.time.LocalDate;

/**
 *
 * @author ivantorale
 */
public class Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vino botella = new Vino("Marqués de Cáceres", "Rioja", 12.5, 15.99);
   
        System.out.println("Detalles de la botella de vino:");
        System.out.println(botella);
        System.out.println("Descuento de la botella de vino: " + botella.getDescuento());
        System.out.println("Calorías de la botella de vino: " + botella.getCalorias());
        System.out.println("--------------------------------------");
        
        LocalDate fechaActual = LocalDate.of(2024, 10, 22);
        Cereales cereal = new Cereales("Kellogg's",150, "Special K",1000,fechaActual);
        
        System.out.println("Detalles del cereal:");
        System.out.println(cereal);
        System.out.println("Calorías del cereal: " + cereal.getCalorias());
        System.out.println("--------------------------------------");
        
        Detergente detergente = new Detergente("Ariel",9.99, 10, 2.5,"Original");
        
        System.out.println("Detalles del detergente:");
        System.out.println(detergente);
        System.out.println("Descuento del detergente: " + detergente.getDescuento());
        System.out.println("Tipo de detergente: " + detergente.getTipoEnvase());
        System.out.println("Variedad de detergente: " + detergente.getVolumen());
    }
}
