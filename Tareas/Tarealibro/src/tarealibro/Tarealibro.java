/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarealibro;

import java.awt.Color;

/**
 *
 * @author danielmtz
 */
public class Tarealibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Tarea del libro");
        Libro libr1 = new Libro();
        libr1.setNombre("java");
        System.out.println("Nombre: " + libr1.getNombre() );
        libr1.setEdicion("cuarta");
        System.out.println("Edicion: " + libr1.getEdicion() );
        libr1.setColor(Color.black);
        System.out.println("Color: " + libr1.getColor() );
        libr1.setEditorial("Alfaomega");
        System.out.println("Editorial: " + libr1.getEditorial() );
        libr1.setPaginas(837);
        System.out.println("Paginas: " + libr1.getPaginas() );
        libr1.cerrarLibro();
        libr1.guardarLibro();
        
        
        Libro libr2 = new Libro();
        libr2.setNombre("Etimologias del español");
        System.out.println("Nombre: " + libr2.getNombre() );
        libr2.setEdicion("Primera");
        System.out.println("Edicion: " + libr2.getEdicion() );
        libr2.setColor(Color.yellow);
        System.out.println("Color: " + libr2.getColor() );
        libr2.setEditorial("Ekdosis");
        System.out.println("Editorial: " + libr2.getEditorial() );
        libr2.setPaginas(248);
        System.out.println("Paginas: " + libr2.getPaginas() );
        libr2.cerrarLibro();
        libr2.guardarLibro();
        
    }
    
}
