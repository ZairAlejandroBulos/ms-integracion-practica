package com.utn.entities;

import java.util.List;

public class Poligono extends FiguraBasica {

    protected List<Lado> lados;

    public Poligono() {
    }

    public Poligono(List<Lado> lados) {
        this.lados = lados;
    }

    public List<Lado> getLados() {
        return lados;
    }

    public void setLados(List<Lado> lados) {
        this.lados = lados;
    }
}
