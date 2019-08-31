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
public class Piramide extends Figuras3D{
    double coordenadaXC, coordenadaYC;
    double lado1, lado2, lado3;
    double altura;

    public Piramide(double coordenadaXC, double coordenadaYC, double altura, double coordenadaXA, double coordenadaYA, double coordenadaXB, double coordenadaYB) {
        super(coordenadaXA, coordenadaYA, coordenadaXB, coordenadaYB);
        this.coordenadaXC = coordenadaXC;
        this.coordenadaYC = coordenadaYC;
        this.altura = altura;
    }
    
    @Override
    public void hallarDatos() {
        lado1 = hallarLado(this.getCoordenadaXA(), this.getCoordenadaYA(), this.getCoordenadaXB(), this.getCoordenadaYB());
        lado2 = hallarLado(this.getCoordenadaXB(), this.getCoordenadaYB(), coordenadaXC, coordenadaYC);
        lado3 = hallarLado(coordenadaXC, coordenadaYC, this.getCoordenadaXA(), this.getCoordenadaYA());
        
        double semiperimetro = (lado1 + lado2 + lado3) / 2;        
        double ladoAux1 = semiperimetro - lado1;
        double ladoAux2 = semiperimetro - lado2;
        double ladoAux3 = semiperimetro - lado3;
        double area =  Math.sqrt((semiperimetro * ladoAux1 * ladoAux2 * ladoAux3));
        this.setArea(area);
        
        this.setVolumen((area*altura)/3);
        hallarTipo();
    }

    @Override
    public void hallarTipo() {
        this.setTipo("Piramide");
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    

   
    
}
