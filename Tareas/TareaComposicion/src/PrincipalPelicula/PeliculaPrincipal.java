/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrincipalPelicula;

import ComponentesPelicula.Actor;
import ComponentesPelicula.Director;
import ComponentesPelicula.Productora;

/**
 *
 * @author danielmtz
 */
public class PeliculaPrincipal {
    //Atributos
    private String nombre;
    private String genero;
    private Director director;
    private Productora productora;
    private Actor actor;

    //Método constructor
    public PeliculaPrincipal() {
        director = new Director(); //Creando objetos
        productora = new Productora(); //Creando objetos
        actor = new Actor(); //Creando objetos
    }

    //Método constructor sobrecargado
    public PeliculaPrincipal(String nombre, String genero, Director director, Productora productora, Actor actor) {
        this.nombre = nombre;
        this.genero = genero;
        this.director = director;
        this.productora = productora;
        this.actor = actor;
    }

    //Método de uso general
    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Productora getProductora() {
        return productora;
    }

    public void setProductora(Productora productora) {
        this.productora = productora;
    }

    @Override
    public String toString() {
        return "PeliculaPrincipal{" + "nombre=" + nombre + ", genero=" + genero + ", director=" + director + ", productora=" + productora + ", actor=" + actor + '}';
    }
    
}
