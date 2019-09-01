/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.figuras;

/**
 * Clase Padre de las figuras 2D
 * @author Tatiana Moreno, Andres Chila
 */
public abstract class Figuras2D extends Figuras{
    //Variable que guarda el perimetro de las figuras
    private double perimetro;
    //Variable que guarda el tipo de figura 
    private String tipo;
    //Pi que se usa para poder realizar calculos
    public static final double PI = 3.1416;
    //Constructor
    public Figuras2D(double coordenadaXA, double coordenadaYA, double coordenadaXB, double coordenadaYB) {
        super(coordenadaXA, coordenadaYA, coordenadaXB, coordenadaYB);
    }

    //Metodo que ayuda a calcular el lado de las figuras y el radio del circulo
    public double hallarLado(double coordenadaXA, double coordenadaYA, double coordenadaXB, double coordenadaYB){
        double auxiliarX = Math.pow(coordenadaXB - coordenadaXA, 2);
        double auxiliarY = Math.pow(coordenadaYB - coordenadaYA, 2);
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    

    
    //Metodo get del perimetro
    public double getPerimetro() {
        return perimetro;
    }

    //Metodo set del perimetro
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    //Metodo get del tipo de figura
    public String getTipo() {
        return tipo;
    }

    //Metodo set del tipo de figura
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
