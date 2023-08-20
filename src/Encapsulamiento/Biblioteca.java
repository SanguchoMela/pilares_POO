package Encapsulamiento;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro){
        libros.add(libro);
        System.out.println("Libro agredado a la biblioteca: "+libro.getTitulo());
    }

    public void mostrarLibros(){
        System.out.println("\nLibros registrados en Biblioteca");
        for(Libro libro:libros){
            System.out.println("-> "+libro.getTitulo()+ " - "+libro.getAutor());
        }
    }
}
