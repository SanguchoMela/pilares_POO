package Abstraccion;

class Cuadrado extends Figura2D{
    double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    double calcularArea(){
        return Math.pow(lado,2);
    }

    @Override
    double calcularPerimetro() {
        return lado*4;
    }
}

