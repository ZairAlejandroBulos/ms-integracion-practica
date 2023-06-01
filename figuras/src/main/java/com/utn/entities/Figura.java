package com.utn.entities;

import java.util.List;

public class Figura {

    private List<FiguraBasica> figurasBasicas;

    public Figura() {
    }

    public Figura(List<FiguraBasica> figurasBasicas) {
        this.figurasBasicas = figurasBasicas;
    }

    public List<FiguraBasica> getFigurasBasicas() {
        return figurasBasicas;
    }

    public void setFigurasBasicas(List<FiguraBasica> figurasBasicas) {
        this.figurasBasicas = figurasBasicas;
    }
}
