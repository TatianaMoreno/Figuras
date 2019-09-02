/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.figuras;

/**
 * Clase Hija Esfera
 * @author Tatiana Moreno, Andres Chila
 */
public class Esfera extends Figuras3D{
    //Variable que guarda el radio de la esfera
    private double radio;
    //El constructor de la clase
    public Esfera(double coordenadaXA, double coordenadaYA, double coordenadaXB, double coordenadaYB) {
        super(coordenadaXA, coordenadaYA, coordenadaXB, coordenadaYB);
    }
    
    @Override
    public void hallarDatos() {
        radio =hallarLado(this.getCoordenadaXA(), this.getCoordenadaYA(), this.getCoordenadaXB(), this.getCoordenadaYB());
        this.setArea(4*PI* Math.pow(radio,2));
        this.setVolumen((4/3)* PI* Math.pow(radio,3));
        hallarTipo();
    }

    @Override
    public void hallarTipo() {
        this.setTipo("Esfera");
    }
    //Metodo get para el radio
    public double getRadio() {
        return radio;
    }
    
    //Metodo get del radio
    public void setRadio(double radio) {
        this.radio = radio;
    }
    

    

    
    
}
