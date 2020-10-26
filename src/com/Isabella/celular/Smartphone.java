package com.Isabella.celular;

public class Smartphone extends Celular{
    private String sistemaOperativo;
    private short capacidad;
    private String conexionWifi;

    public short getCapacidad() {
        return capacidad;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getConexionWifi() {
        return conexionWifi;
    }

    public void setConexionWifi(String conexionWifi) {
        this.conexionWifi = conexionWifi;
    }

    public void navegar(){
        System.out.println("Esta navegando en internet");
    }

    public void chatear(){
        System.out.println("Esta chateando");
    }
}
