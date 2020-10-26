package com.Isabella.celular;

public class Celular {
    private String marca;
    private String color;
    private String serial;
    private String operador;

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public String getSerial() {
        return serial;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public void llamar(){
        System.out.println("Esta llamando");
    }
}
