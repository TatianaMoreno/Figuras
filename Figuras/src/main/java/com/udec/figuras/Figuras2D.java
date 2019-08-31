/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.figuras;

/**
 *
 * @author Tatiana Moreno, Andres Chila
 */
public abstract class Figuras2D extends Figuras{
    
    private double perimetro;
    
    private String tipo;
    public static final double PI = 3.1416;

    public Figuras2D(double coordenadaXA, double coordenadaYA, double coordenadaXB, double coordenadaYB) {
        super(coordenadaXA, coordenadaYA, coordenadaXB, coordenadaYB);
    }

    
    
    public double hallarLado(double coordenadaXA, double coordenadaYA, double coordenadaXB, double coordenadaYB){
        double auxiliarX = Math.pow(coordenadaXB - coordenadaXA, 2);
        double auxiliarY = Math.pow(coordenadaYB - coordenadaYA, 2);
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    

    

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
