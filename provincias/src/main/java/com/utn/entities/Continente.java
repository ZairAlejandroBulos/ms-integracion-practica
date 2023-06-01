package com.utn.entities;

import java.util.List;

public class Continente {

    private String nombre;
    private List<Pais> paises;

    public Continente() {
    }

    public Continente(String nombre, List<Pais> paises) {
        this.nombre = nombre;
        this.paises = paises;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Pais> getPaises() {
        return paises;
    }

    public void setPaises(List<Pais> paises) {
        this.paises = paises;
    }

    public void addPais(Pais pais) {
        this.paises.add(pais);
    }

    @Override
    public String toString() {
        return "Continente{" +
                "nombre='" + nombre + '\'' +
                ", paises=" + paises +
                '}';
    }
}
