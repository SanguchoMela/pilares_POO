package Abstraccion;

public class Triangulo extends Figura2D {
    double lado;
    double altura;

    public Triangulo(double lado, double altura) {
        this.lado = lado;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return (lado*altura)/2;
    }

    @Override
    double calcularPerimetro() {
        return lado*3;
    }
}

