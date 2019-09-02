/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.figuras;

/**
 *  Clase Super Padre 
 * @author Tatiana Moreno, Andres Chila
 */
public abstract class Figuras implements Comportamiento{
    //posicion x, y del primer punto (A)
    private double coordenadaXA;
    private double coordenadaYA;
    //posicion x, y del segundo punto (B)
    private double coordenadaXB;
    private double coordenadaYB;
    //Variable que guarda el area de las figuras
    private double area;
    //Constructor de la clase
    public Figuras(double coordenadaXA, double coordenadaYA, double coordenadaXB, double coordenadaYB) {
        this.coordenadaXA = coordenadaXA;
        this.coordenadaYA = coordenadaYA;
        this.coordenadaXB = coordenadaXB;
        this.coordenadaYB = coordenadaYB;
        
    }
    //Metodo get del area
    public double getArea() {
        return area;
    }

    //Metodo set del area
    public void setArea(double area) {
        this.area = area;
    }
    
    //Metodo get de las coordenadas en X del punto A
    public double getCoordenadaXA() {
        return coordenadaXA;
    }

    //Metodo set de las coordenadas en X del punto A
    public void setCoordenadaXA(double coordenadaXA) {
        this.coordenadaXA = coordenadaXA;
    }

    //Metodo get de las coordenadas en Y del punto A
    public double getCoordenadaYA() {
        return coordenadaYA;
    }

    //Metodo set de las coordenadas en Y del punto A
    public void setCoordenadaYA(double coordenadaYA) {
        this.coordenadaYA = coordenadaYA;
    }

    //Metodo get de las coordenadas en X del punto B
    public double getCoordenadaXB() {
        return coordenadaXB;
    }

    //Metodo set de las coordenadas en X del punto B
    public void setCoordenadaXB(double coordenadaXB) {
        this.coordenadaXB = coordenadaXB;
    }

    //Metodo get de las coordenadas en Y del punto B
    public double getCoordenadaYB() {
        return coordenadaYB;
    }

    //Metodo set de las coordenadas en Y del punto B
    public void setCoordenadaYB(double coordenadaYB) {
        this.coordenadaYB = coordenadaYB;
    }
}
