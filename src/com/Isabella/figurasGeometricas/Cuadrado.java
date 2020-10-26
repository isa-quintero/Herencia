package com.Isabella.figurasGeometricas;

public class Cuadrado extends FigurasGeometricas{
    private short tamañoLados;

    public short getTamañoLados() {
        return tamañoLados;
    }

    public void setTamañoLados(short tamañoLados) {
        this.tamañoLados = tamañoLados;
    }

    public void calcularPerimetroCuadrado(){
        float perimetroCuadrado;
        perimetroCuadrado =this.tamañoLados*4;
        this.setPerimetro(perimetroCuadrado);
    }

    public void calcularAreaTriangulo(){
        float areaCuadrado;
        areaCuadrado = (this.tamañoLados)*(this.tamañoLados);
        this.setArea(areaCuadrado);
    }
}
