/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareacomposicion;

import ComponentesLibro.Autor;
import ComponentesLibro.Editorial;
import PrincipalLibro.LibroPrincipal;
import ComponentesPelicula.Actor;
import ComponentesPelicula.Director;
import ComponentesPelicula.Productora;
import PrincipalPelicula.PeliculaPrincipal;
/**
 *
 * @author danielmtz
 */
public class TareaComposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LibroPrincipal lib = new LibroPrincipal();
        lib.setNombre("Corazonada");
        lib.setEscritor(new Autor("Benito Taibo",61));
        lib.setEditorial(new Editorial("Planeta","México"));
        lib.setNumPag(156);
        System.out.println(lib);
        
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
        
        PeliculaPrincipal pel = new PeliculaPrincipal();
        pel.setNombre("Nosotros los nobles");
        pel.setGenero("Comedia");
        pel.setDirector(new Director("Gary Alazraki",39));
        pel.setProductora(new Productora("Alazraki Films","Variado"));
        pel.setActor(new Actor("Luis Gerardo Mendez",40));
        System.out.println(pel);
    }
    
}
