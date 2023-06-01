package com.utn;

import com.utn.entities.Ciudad;
import com.utn.entities.Continente;
import com.utn.entities.Pais;
import com.utn.entities.Provincia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Bulos
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 2");

        // Argentina
        Ciudad ciudadMendoza = new Ciudad("Ciudad de Mendoza");
        Provincia provinciaMendoza = new Provincia(
                "Provincia de Mendoza",
                false,
                new ArrayList<>(Collections.singletonList(ciudadMendoza)),
                null,
                null
        );
        Pais argentina = new Pais(
                "Argentina",
                new ArrayList<>(Collections.singletonList(provinciaMendoza)),
                null
        );

        // Perú
        Ciudad ciudadCusco = new Ciudad("Ciudad de Cusco");
        Provincia provinciaCusco = new Provincia(
                "Cusco",
                true,
                new ArrayList<>(Collections.singletonList(ciudadCusco)),
                null,
                new ArrayList<>(Collections.singletonList(argentina))
        );
        Pais peru = new Pais(
                "Peru",
                new ArrayList<>(Collections.singletonList(provinciaCusco)),
                new ArrayList<>(Collections.singletonList(argentina))
        );

        // Bolivia
        Ciudad ciudadLaPaz = new Ciudad("Ciudad de La Paz");
        Provincia provinciaLaPaz = new Provincia(
                "La Paz",
                true,
                new ArrayList<>(Collections.singletonList(ciudadLaPaz)),
                null,
                new ArrayList<>(Collections.singletonList(peru))
        );
        Pais bolivia = new Pais(
                "Bolivia",
                new ArrayList<>(Collections.singletonList(provinciaLaPaz)),
                new ArrayList<>(Collections.singletonList(peru))
        );

        // Continente
        List<Pais> paisesAmerica = new ArrayList<>();
        paisesAmerica.add(argentina);
        paisesAmerica.add(peru);
        paisesAmerica.add(bolivia);
        Continente america = new Continente("America", paisesAmerica);

        // Console
        System.out.println(argentina.toString());
        System.out.println(peru.toString());
        System.out.println(bolivia.toString());
        System.out.println(america.toString());
    }
}