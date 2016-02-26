package com.example.intel.usodevolley;

/**
 * Created by PC on 26/02/2016.
 */
public class Articulo {

    String titulo;
    String contenido;
    int imagen;

    public Articulo(String titulo,String contenido ,int id ){

        this.titulo=titulo;
        this.contenido=contenido;
        this.imagen=imagen;


    }


    public String getContenido() {
        return contenido;
    }

    public int getImagen() {
        return imagen;
    }

    public String getTitulo() {
        return titulo;
    }
}
