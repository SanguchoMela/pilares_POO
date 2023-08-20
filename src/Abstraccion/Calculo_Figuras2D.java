package Abstraccion;

public class Calculo_Figuras2D {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(5);
        Triangulo triangulo = new Triangulo(8,6);

        System.out.println("Area del cuadrado: "+cuadrado.calcularArea());
        System.out.println("Perimetro del cuadrado: "+cuadrado.calcularPerimetro());

        System.out.println("Area del triangulo: "+triangulo.calcularArea());
        System.out.println("Perimetro del triangulo: "+triangulo.calcularPerimetro());
    }
}
