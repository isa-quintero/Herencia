package com.Isabella.persona;

public class Profesor extends Persona{
    private String materiaQueEnseña;
    private String titulo;

    public String getMateriaQueEnseña() {
        return materiaQueEnseña;
    }

    public void setMateriaQueEnseña(String materiaQueEnseña) {
        this.materiaQueEnseña = materiaQueEnseña;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void enseñar(){
        System.out.println("Esta enseñando "+ materiaQueEnseña );
    }
}
