package com.utn.entities;

public class Elipse extends FiguraBasica {

    protected Double longitudEjeMenor;
    protected Double longitudEjeMayor;
    protected Punto centro;

    public Elipse() {
    }

    public Elipse(Double longitudEjeMenor, Double longitudEjeMayor, Punto centro) {
        this.longitudEjeMenor = longitudEjeMenor;
        this.longitudEjeMayor = longitudEjeMayor;
        this.centro = centro;
    }
}
