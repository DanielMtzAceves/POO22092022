/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarealibro;

import java.awt.Color;

/**
 *
 * @author danielmtz
 */
public class Libro {
    private String nombre;
    private String edicion;
    private Color color;
    private String editorial;
    private int paginas;

    public Libro() {
    }

    public Libro(String nombre, String edicion, Color color, String editorial, int paginas) {
        this.nombre = nombre;
        this.edicion = edicion;
        this.color = color;
        this.editorial = editorial;
        this.paginas = paginas;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
    
    public void cerrarLibro(){
        System.out.println("El libro " + this.nombre + " està cerrado");
    }
    
    public void guardarLibro(){
        System.out.println("Guardando el libro " + this.nombre);
    }
}
