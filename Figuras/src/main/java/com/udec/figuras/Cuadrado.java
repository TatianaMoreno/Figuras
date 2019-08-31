/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.figuras;

/**
 * Clase Hija Cuadrado
 * @author Tatiana Moreno, Andres Chila
 */
public class Cuadrado extends Figuras2D{
    //Variables que guardan los valores de los lados del cuadrado 
    private double lado1,lado2,lado3,lado4;
    //Variables que guardan las coordenadas
    private double coordenadaXC, coordenadaYC;
    //Constructor de la clase
    public Cuadrado(double coordenadaXC, double coordenadaYC, double coordenadaXA, double coordenadaYA, double coordenadaXB, double coordenadaYB) {
        super(coordenadaXA, coordenadaYA, coordenadaXB, coordenadaYB);
        this.coordenadaXC = coordenadaXC;
        this.coordenadaYC = coordenadaYC;
    }

    @Override
    public void hallarDatos() {
        lado1 = hallarLado(this.getCoordenadaXA(), this.getCoordenadaYA(), this.getCoordenadaXB(), this.getCoordenadaYB());
        lado2 = hallarLado(this.getCoordenadaXB(), this.coordenadaXC, this.getCoordenadaYB(), this.coordenadaYC);
        lado3=lado1;
        lado4=lado2;
        this.setArea(lado1*lado2);
        this.setPerimetro(lado1+lado2+lado3+lado4);
        hallarTipo();
    }
    //Metodo get del primer lado de la figura
    public double getLado1() {
        return lado1;
    }
    //Metodo set del primer lado de la figura

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    //Metodo get del segundo lado de la figura
    public double getLado2() {
        return lado2;
    }

    //Metodo set del segundo lado de la figura
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    //Metodo get del tercer lado de la figura
    public double getLado3() {
        return lado3;
    }

    //Metodo set del tercer lado de la figura
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    //Metodo get del cuarto lado de la figura
    public double getLado4() {
        return lado4;
    }

    //Metodo set del cuarto lado de la figura
    public void setLado4(double lado4) {
        this.lado4 = lado4;
    }

    //Metodo get de las coordenadas de la figura en X
    public double getCoordenadaXC() {
        return coordenadaXC;
    }

    //Metodo set de las coordenadas de la figura en X
    public void setCoordenadaXC(double coordenadaXC) {
        this.coordenadaXC = coordenadaXC;
    }

    //Metodo get de las coordenadas de la figura en Y
    public double getCoordenadaYC() {
        return coordenadaYC;
    }

    //Metodo gSETet de las coordenadas de la figura en Y
    public void setCoordenadaYC(double coordenadaYC) {
        this.coordenadaYC = coordenadaYC;
    }

    @Override
    public void hallarTipo() {
        if(lado1 == lado4 && lado2 == lado3){
            this.setTipo("Cuadrado cuadrado");
        }
        else if(lado1 == lado3 && lado2 == lado4){
            this.setTipo("Cuadrado Rectangulo");
        }
        else{
            this.setTipo("No es cuadrado ni rectangulo");
        }
        
        
    }
    

    
    
}
