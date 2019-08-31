/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.figuras;

import com.sun.corba.se.impl.util.PackagePrefixChecker;

/**
 *
 * @author Tatiana Moreno, Andres Chila
 */
public abstract class Figuras implements Comportamiento{
    //posicion x, y del primer punto (A)
    private double coordenadaXA;
    private double coordenadaYA;
    //posicion x, y del segundo punto (B)
    private double coordenadaXB;
    private double coordenadaYB;
    
    private double area;

    public Figuras(double coordenadaXA, double coordenadaYA, double coordenadaXB, double coordenadaYB) {
        this.coordenadaXA = coordenadaXA;
        this.coordenadaYA = coordenadaYA;
        this.coordenadaXB = coordenadaXB;
        this.coordenadaYB = coordenadaYB;
        
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    public double getCoordenadaXA() {
        return coordenadaXA;
    }

    public void setCoordenadaXA(double coordenadaXA) {
        this.coordenadaXA = coordenadaXA;
    }

    public double getCoordenadaYA() {
        return coordenadaYA;
    }

    public void setCoordenadaYA(double coordenadaYA) {
        this.coordenadaYA = coordenadaYA;
    }

    public double getCoordenadaXB() {
        return coordenadaXB;
    }

    public void setCoordenadaXB(double coordenadaXB) {
        this.coordenadaXB = coordenadaXB;
    }

    public double getCoordenadaYB() {
        return coordenadaYB;
    }

    public void setCoordenadaYB(double coordenadaYB) {
        this.coordenadaYB = coordenadaYB;
    }
}
