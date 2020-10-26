package com.Isabella.persona;

public class Persona {
    private String identificacion;
    private String nombre;
    private byte edad;
    private char sexo;

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public void caminar(){
        System.out.println("Esta caminando");
    }
    public void comer(){
        System.out.println("Esta comiendo");
    }
}
