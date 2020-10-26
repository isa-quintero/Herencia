package com.Isabella.figurasGeometricas;

public class Triangulo extends FigurasGeometricas {
    private String clasificacion;
    private short tamañoAngulos;
    private short tamañoLado1;
    private short tamañoLado2;
    private short base;
    private short altura;

    public short getAltura() {
        return altura;
    }

    public void setAltura(short altura) {
        this.altura = altura;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public short getTamañoAngulos() {
        return tamañoAngulos;
    }

    public void setTamañoAngulos(short tamañoAngulos) {
        this.tamañoAngulos = tamañoAngulos;
    }

    public short getTamañoLado1() {
        return tamañoLado1;
    }

    public void setTamañoLado1(short tamañoLado1) {
        this.tamañoLado1 = tamañoLado1;
    }

    public short getTamañoLado2() {
        return tamañoLado2;
    }

    public void setTamañoLado2(short tamañoLado2) {
        this.tamañoLado2 = tamañoLado2;
    }

    public short getBase() {
        return base;
    }

    public void setBase(short base) {
        this.base = base;
    }

    public void calcularPerimetroTriangulo(){
        float perimetro;
        perimetro =this.tamañoLado1 + this.tamañoLado2 + this.base;
        this.setPerimetro(perimetro);
    }

    public void calcularAreaTriangulo(){
        float area;
        area = (this.base * this.altura)/2;
        this.setArea(area);
    }
}
