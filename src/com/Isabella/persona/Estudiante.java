package com.Isabella.persona;

public class Estudiante extends Persona{
    private String materiaQueCursa;

    public String getMateriaQueCursa() {
        return materiaQueCursa;
    }

    public void setMateriaQueCursa(String materiaQueCursa) {
        this.materiaQueCursa = materiaQueCursa;
    }

    public void aprender(){
        System.out.println("Esta aprendiendo "+materiaQueCursa);
    }

}
