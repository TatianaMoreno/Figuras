/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.figuras;

/**
 * Clase Hija Circulo 
 * @author Tatiana Moreno, Andres Chila
 */
public class Circulo extends Figuras2D{
    //La variable del radio para calculos
    private double radio;
    //La variable diametro que se usa para calculos
    private double diametro;
    //Constructor
    public Circulo(double coordenadaXA, double coordenadaYA, double coordenadaXB, double coordenadaYB) {
        super(coordenadaXA, coordenadaYA, coordenadaXB, coordenadaYB);
        hallarDatos();
    }
    @Override
    public void hallarDatos() {
        this.radio = hallarLado(this.getCoordenadaXA(), this.getCoordenadaYA(), this.getCoordenadaXB(), this.getCoordenadaYB());
        this.diametro = radio*2;
        this.setPerimetro(2*PI * this.radio);
        this.setArea(PI * Math.pow(this.radio, 2));
        hallarTipo();
    }
    //Metodo get del radio
    public double getRadio() {
        return radio;
    }

    //Metodo set del radio
    public void setRadio(double radio) {
        this.radio = radio;
    }

    //Metodo get del diametro
    public double getDiametro() {
        return diametro;
    }

    //Metodo set del diametro
    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public void hallarTipo() {
        this.setTipo("Circulo circulo");
    }

    

    
    
}
