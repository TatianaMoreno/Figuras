/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.figuras;

/**
 *  Clase padre de las figuras en 3D
 * @author Tatiana Moreno, Andres Chila
 */
public abstract class Figuras3D extends Figuras{
    //Variable que guarda el volumen de la figura
    private double volumen;
    //La variable de Pi para poder realizar los calculos
    public static final double PI = 3.1416;
    //Variable que guarda el tipo de figura
    private String tipo;
    //Constructor de la clase
    public Figuras3D(double coordenadaXA, double coordenadaYA, double coordenadaXB, double coordenadaYB) {
        super(coordenadaXA, coordenadaYA, coordenadaXB, coordenadaYB);
    }
    //Metodo que ayuda a calcular el lado de las figuras y el radio del circulo
    public double hallarLado(double coordenadaXA, double coordenadaYA, double coordenadaXB, double coordenadaYB){
        double auxiliarX = Math.pow(coordenadaXB - coordenadaXA, 2);
        double auxiliarY = Math.pow(coordenadaYB - coordenadaYA, 2);
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    //Metodo que devuelve el volumen de la figura
    public double getVolumen() {
        return volumen;
    }

    //Metodo que guarda el volumen de la figura
    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    //Metodo que devuelve el tipo de la figura
    public String getTipo() {
        return tipo;
    }

    //Metodo que guarda  el tipo de la figura
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
