package com.example.proyecto_petagram40.contenedor;

public class Mascota {
    private int id;
    private int foto;
    private String nombre;
    private int Likes;

    public Mascota(int foto, String nombre) {
        this.foto = foto;
        this.nombre = nombre;
        this.Likes = 0;
    }

    public Mascota() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMeGustas() {
        return Likes;
    }

    public void setMeGustas(int meGustas) {
        this.Likes = meGustas;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
