package com.utn.entities;

import java.util.List;

public class Provincia {

    private String nombre;
    private Boolean isCapitalDelPais;
    private List<Ciudad> ciudades;
    private List<Provincia> provinciasLimitantes;
    private List<Pais> paisesLimitrofes;

    public Provincia() {
    }

    public Provincia(String nombre, Boolean isCapitalDelPais, List<Ciudad> ciudades, List<Provincia> provinciasLimitantes, List<Pais> paisesLimitrofes) {
        this.nombre = nombre;
        this.isCapitalDelPais = isCapitalDelPais;
        this.ciudades = ciudades;
        this.provinciasLimitantes = provinciasLimitantes;
        this.paisesLimitrofes = paisesLimitrofes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getCapitalDelPais() {
        return isCapitalDelPais;
    }

    public void setCapitalDelPais(Boolean capitalDelPais) {
        isCapitalDelPais = capitalDelPais;
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(List<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    public List<Provincia> getProvinciasLimitantes() {
        return provinciasLimitantes;
    }

    public void setProvinciasLimitantes(List<Provincia> provinciasLimitantes) {
        this.provinciasLimitantes = provinciasLimitantes;
    }

    public List<Pais> getPaisesLimitrofes() {
        return paisesLimitrofes;
    }

    public void setPaisesLimitrofes(List<Pais> paisesLimitrofes) {
        this.paisesLimitrofes = paisesLimitrofes;
    }

    public void addCiudad(Ciudad ciudad) {
        this.ciudades.add(ciudad);
    }

    public void addPaisesLimitrofes(Pais pais) {
        this.paisesLimitrofes.add(pais);
    }

    public void addProvinciasLimitantes(Provincia provincia) {
        this.provinciasLimitantes.add(provincia);
    }

    @Override
    public String toString() {
        return "Provincia{" +
                "nombre='" + nombre + '\'' +
                ", isCapitalDelPais=" + isCapitalDelPais +
                ", ciudades=" + ciudades +
                ", provinciasLimitantes=" + provinciasLimitantes +
                ", paisesLimitrofes=" + paisesLimitrofes +
                '}';
    }
}
