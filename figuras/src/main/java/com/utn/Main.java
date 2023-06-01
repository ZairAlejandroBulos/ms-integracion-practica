package com.utn;

import com.utn.entities.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bulos
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 1");

        Punto punto1 = new Punto(2.0, 3.0);
        Punto punto2 = new Punto(5.0, 7.0);

        List<Lado> lados = new ArrayList<Lado>();
        Lado lado = new Lado(punto1, punto2);
        lados.add(lado);

        Triangulo triangulo = new Triangulo(lados);

        Figura figura = new Figura();
        List<FiguraBasica> figurasBasicas = new ArrayList<>();
        figurasBasicas.add(triangulo);
        figura.setFigurasBasicas(figurasBasicas);

        List<FiguraBasica> figuras = figura.getFigurasBasicas();
        for (FiguraBasica fb : figuras) {
            if (fb instanceof Triangulo) {
                Triangulo trianguloActual = (Triangulo) fb;
                List<Lado> ladosTriangulo = trianguloActual.getLados();
                for (Lado ladoTriangulo : ladosTriangulo) {
                    Punto puntoInicio = ladoTriangulo.getPunto1();
                    Punto puntoFin = ladoTriangulo.getPunto2();
                    System.out.println("Punto de inicio: (" + puntoInicio.getX() + ", " + puntoInicio.getY() + ")");
                    System.out.println("Punto final: (" + puntoFin.getX() + ", " + puntoFin.getY() + ")");
                }
            }
        }
    }
}