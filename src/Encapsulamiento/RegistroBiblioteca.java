package Encapsulamiento;

public class RegistroBiblioteca {
    public static void main(String[] args) {
        Biblioteca miBiblioteca = new Biblioteca();

        Libro libro1 = new Libro("Prodigio","Marie Lu");
        Libro libro2 = new Libro("Divergente","Veronica Roth");
        Libro libro3 = new Libro("Los juegos del hambre","Suzanne Collins");
        Libro libro4 = new Libro("La quita ola","Rick Yancey");

        miBiblioteca.agregarLibro(libro1);
        miBiblioteca.agregarLibro(libro2);
        miBiblioteca.agregarLibro(libro3);
        miBiblioteca.agregarLibro(libro4);

        miBiblioteca.mostrarLibros();
    }
}
