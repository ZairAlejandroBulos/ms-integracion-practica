package com.utn.entities;

import java.util.List;

public class Pais {

    private String nombre;
    private List<Provincia> provincias;
    private List<Pais> paisesLimitrofes;

    public Pais() {
    }

    public Pais(String nombre, List<Provincia> provincias, List<Pais> paisesLimitrofes) {
        this.nombre = nombre;
        this.provincias = provincias;
        this.paisesLimitrofes = paisesLimitrofes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(List<Provincia> provincias) {
        this.provincias = provincias;
    }

    public List<Pais> getPaisesLimitrofes() {
        return paisesLimitrofes;
    }

    public void setPaisesLimitrofes(List<Pais> paisesLimitrofes) {
        this.paisesLimitrofes = paisesLimitrofes;
    }

    public void addProvincia(Provincia provincia) {
        this.provincias.add(provincia);
    }

    public void addPaisesLimitrofes(Pais pais) {
        this.paisesLimitrofes.add(pais);
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", provincias=" + provincias +
                ", paisesLimitrofes=" + paisesLimitrofes +
                '}';
    }
}
