package com.Isabella.figurasGeometricas;

public class Circulo extends FigurasGeometricas{
    private short diametro;
    private short radio;

    public short getDiametro() {
        return diametro;
    }

    public void setDiametro(short diametro) {
        this.diametro = diametro;
    }

    public short getRadio() {
        return radio;
    }

    public void setRadio(short radio) {
        this.radio = radio;
    }

    public void calcularPerimetroCiculo(){
        float perimetroCirculo;
        perimetroCirculo = (float) (2*(3.1416)*this.radio);
        this.setPerimetro(perimetroCirculo);
    }

    public void calcularAreaCirculo(){
        float areaCirculo;
        areaCirculo = (float) ((3.1416)*(this.radio)*(this.radio));
        this.setArea(areaCirculo);
    }

}
