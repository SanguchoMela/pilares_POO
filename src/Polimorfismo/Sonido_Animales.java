package Polimorfismo;

public class Sonido_Animales {
    public static void main(String[] args) {
        Animal burro = new Burro();
        Animal lobo = new Lobo();

        burro.hacerSonido();
        lobo.hacerSonido();
    }
}
