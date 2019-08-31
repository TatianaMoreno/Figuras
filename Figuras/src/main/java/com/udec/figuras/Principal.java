/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.figuras;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Andres Chila, Tatiana Moreno
 */
public class Principal {
    //Lista que guarda todas las figuras que se crean
    private List<Figuras> listaFiguras = new ArrayList<>();
    //Variable que guarda la respuesta para proximas figuras
    private String respuesta, sigue = "si";
    //Variables que permite obtener lo escrito en consola
    Scanner scannerNumeros = new Scanner(System.in);
    Scanner scannerStrings = new Scanner(System.in);
    //posicion x, y del primer punto (A)
    private double coordenadaXA;
    private double coordenadaYA;
    //posicion x, y del segundo punto (B)
    private double coordenadaXB;
    private double coordenadaYB;
    //posicion x, y del tercer punto (C)
    private double coordenadaXC;
    private double coordenadaYC;
    
    public Principal() {
        do {
            System.out.print("Que figura desea ingresar?: ");
            respuesta = scannerStrings.nextLine();
            respuesta = respuesta.toLowerCase();
            switch (respuesta) {
                case "circulo":
                    setearCosasCirculo();
                    break;
                case "cuadrado":
                    setearCosasCuadrado();
                    break;
                case "triangulo":
                    setearCosasTriangulo();
                    break;
                case "esfera":
                    setearCosasEsfera();
                    break;
                case "cubo":
                    setearCosasCubo();
                    break;
                case "piramide":
                    setearCosasPiramide();
                    break;
                default:
                    System.out.println("Esa figura no exste");
            }
            System.out.println("Desea ingresar otra figura?(si/no): ");
            sigue = scannerStrings.nextLine();
        } while (sigue.equals("si"));
        imprimirLista();
    }
    //Metodo que imprime los calculos resultantes de las figuras
    public void imprimirLista() {
        for (Figuras lista : listaFiguras) {
            if (lista instanceof Circulo) {
                System.out.println(((Circulo) lista).getTipo());
                System.out.println("Radio: " + ((Circulo) lista).getRadio());
                System.out.println("Area: " + ((Circulo) lista).getArea());
                System.out.println("Perimetro: " + ((Circulo) lista).getArea());
            }
            if (lista instanceof Cuadrado) {
                System.out.println(((Cuadrado) lista).getTipo());
                System.out.println("Lado inferior: " + ((Cuadrado) lista).getLado1());
                System.out.println("Lado derecho: " + ((Cuadrado) lista).getLado2());
                System.out.println("Lado superior: " + ((Cuadrado) lista).getLado3());
                System.out.println("Lado izquierdo: " + ((Cuadrado) lista).getLado4());
                System.out.println("Area: " + ((Cuadrado) lista).getArea());
                System.out.println("Perimetro: " + ((Cuadrado) lista).getPerimetro());
            }
            if (lista instanceof Triangulo) {
                System.out.println(((Triangulo) lista).getTipo());
                System.out.println("Lado 1: " + ((Triangulo) lista).getLado1());
                System.out.println("Lado 2: " + ((Triangulo) lista).getLado2());
                System.out.println("Lado 3: " + ((Triangulo) lista).getLado3());
                System.out.println("Area: " + ((Triangulo) lista).getArea());
            }
            if (lista instanceof Esfera) {
                System.out.println(((Esfera) lista).getTipo());
                System.out.println("Radio: " + ((Esfera) lista).getRadio());
                System.out.println("Area: " + ((Esfera) lista).getArea());
                System.out.println("Volumen: " + ((Esfera) lista).getVolumen());
            }
            if (lista instanceof Cubo) {
                System.out.println(((Cubo) lista).getTipo());
                System.out.println("Lado inferior base: " + ((Cubo) lista).getLado1());
                System.out.println("Lado derecho base: " + ((Cubo) lista).getLado2());
                System.out.println("Lado superior base: " + ((Cubo) lista).getLado3());
                System.out.println("Lado izquierdo base: " + ((Cubo) lista).getLado4());
                System.out.println("Altura: " + ((Cubo) lista).getAltura());
                System.out.println("Area: " + ((Cubo) lista).getArea());
                System.out.println("Volumen: " + ((Cubo) lista).getVolumen());
            }
            if (lista instanceof Piramide) {
                System.out.println(((Piramide) lista).getTipo());
                System.out.println("Lado 1 base: " + ((Piramide) lista).getLado1());
                System.out.println("Lado 2: " + ((Piramide) lista).getLado2());
                System.out.println("Lado 3: " + ((Piramide) lista).getLado3());
                System.out.println("Altura: " + ((Piramide) lista).getAltura());
                System.out.println("Area: " + ((Piramide) lista).getArea());
                System.out.println("Volumen: " + ((Piramide) lista).getVolumen());
            }
            System.out.println("--------------------------------------");
        }
    }
    //Metodo de set para el Circulo
    public void setearCosasCirculo() {
        System.out.print("Ingrese coordenada X del primer punto: ");
        coordenadaXA = scannerNumeros.nextDouble();
        System.out.print("Ingrese coordenada Y del primer punto: ");
        coordenadaYA = scannerNumeros.nextDouble();
        System.out.print("Ingrese coordenada X del segundo punto: ");
        coordenadaXB = scannerNumeros.nextDouble();
        System.out.print("Ingrese coordenada Y del segundo punto: ");
        coordenadaYB = scannerNumeros.nextDouble();
        Figuras circulo = new Circulo(coordenadaXA, coordenadaYA, coordenadaXB, coordenadaYB);
        listaFiguras.add(circulo);
    }
    
    //Metodo de set para el Cuadrado
    public void setearCosasCuadrado() {
        System.out.print("Ingrese coordenada X del primer punto: ");
        coordenadaXA = scannerNumeros.nextDouble();
        System.out.print("Ingrese coordenada Y del primer punto: ");
        coordenadaYA = scannerNumeros.nextDouble();
        System.out.print("Ingrese coordenada X del segundo punto: ");
        coordenadaXB = scannerNumeros.nextDouble();
        System.out.print("Ingrese coordenada Y del segundo punto: ");
        coordenadaYB = scannerNumeros.nextDouble();
        System.out.print("Ingrese coordenada X del tercer punto: ");
        coordenadaXC = scannerNumeros.nextDouble();
        System.out.print("Ingrese coordenada Y del tercer punto: ");
        coordenadaYC = scannerNumeros.nextDouble();
        Figuras cuadrado = new Cuadrado(coordenadaXC, coordenadaYC, coordenadaXA, coordenadaYA, coordenadaXB, coordenadaYB);
        cuadrado.hallarDatos();
        listaFiguras.add(cuadrado);
    }

    //Metodo de set para el Triangulo
    public void setearCosasTriangulo() {
        System.out.print("Ingrese coordenada X del primer punto: ");
        coordenadaXA = scannerNumeros.nextDouble();
        System.out.print("Ingrese coordenada Y del primer punto: ");
        coordenadaYA = scannerNumeros.nextDouble();
        System.out.print("Ingrese coordenada X del segundo punto: ");
        coordenadaXB = scannerNumeros.nextDouble();
        System.out.print("Ingrese coordenada Y del segundo punto: ");
        coordenadaYB = scannerNumeros.nextDouble();
        System.out.print("Ingrese coordenada X del tercer punto: ");
        coordenadaXC = scannerNumeros.nextDouble();
        System.out.print("Ingrese coordenada Y del tercer punto: ");
        coordenadaYC = scannerNumeros.nextDouble();
        Figuras triangulo = new Triangulo(coordenadaXC, coordenadaYC, coordenadaXA, coordenadaYA, coordenadaXB, coordenadaYB);
        triangulo.hallarDatos();
        listaFiguras.add(triangulo);
    }

    //Metodo de set para la esfera
    public void setearCosasEsfera() {
        System.out.print("Ingrese coordenada X del primer punto: ");
        coordenadaXA = scannerNumeros.nextDouble();
        System.out.print("Ingrese coordenada Y del primer punto: ");
        coordenadaYA = scannerNumeros.nextDouble();
        System.out.print("Ingrese coordenada X del segundo punto: ");
        coordenadaXB = scannerNumeros.nextDouble();
        System.out.print("Ingrese coordenada Y del segundo punto: ");
        coordenadaYB = scannerNumeros.nextDouble();
        Figuras esfera = new Esfera(coordenadaXA, coordenadaYA, coordenadaXB, coordenadaYB);
        esfera.hallarDatos();
        listaFiguras.add(esfera);
    }

    //Metodo de set para el Cubo
    public void setearCosasCubo() {
        System.out.print("Ingrese coordenada X del primer punto (base): ");
        coordenadaXA = scannerNumeros.nextDouble();
        System.out.print("Ingrese coordenada Y del primer punto (base): ");
        coordenadaYA = scannerNumeros.nextDouble();
        System.out.print("Ingrese coordenada X del segundo punto (base): ");
        coordenadaXB = scannerNumeros.nextDouble();
        System.out.print("Ingrese coordenada Y del segundo punto (base): ");
        coordenadaYB = scannerNumeros.nextDouble();
        System.out.print("Ingrese coordenada X del tercer punto (base): ");
        coordenadaXC = scannerNumeros.nextDouble();
        System.out.print("Ingrese coordenada Y del tercer punto (base): ");
        coordenadaYC = scannerNumeros.nextDouble();
        System.out.print("Ingrese altura del cubo: ");
        double alturaCubo = scannerNumeros.nextDouble();
        Figuras cubo = new Cubo(coordenadaXC, coordenadaYC, alturaCubo, coordenadaXA, coordenadaYA, coordenadaXB, coordenadaYB);
        cubo.hallarDatos();
        listaFiguras.add(cubo);
    }

    //Metodo de set para la Piramide
    public void setearCosasPiramide() {
        System.out.print("Ingrese coordenada X del primer punto (base): ");
        coordenadaXA = scannerNumeros.nextDouble();
        System.out.print("Ingrese coordenada Y del primer punto (base): ");
        coordenadaYA = scannerNumeros.nextDouble();
        System.out.print("Ingrese coordenada X del segundo punto (base): ");
        coordenadaXB = scannerNumeros.nextDouble();
        System.out.print("Ingrese coordenada Y del segundo punto (base): ");
        coordenadaYB = scannerNumeros.nextDouble();
        System.out.print("Ingrese coordenada X del tercer punto (base): ");
        coordenadaXC = scannerNumeros.nextDouble();
        System.out.print("Ingrese coordenada Y del tercer punto (base): ");
        coordenadaYC = scannerNumeros.nextDouble();
        System.out.print("Ingrese altura del cubo: ");
        double alturaPiramide = scannerNumeros.nextDouble();
        Figuras piramide = new Piramide(coordenadaXC, coordenadaYC, alturaPiramide, coordenadaXA, coordenadaYA, coordenadaXB, coordenadaYB);
        piramide.hallarDatos();
        listaFiguras.add(piramide);
    }

}
