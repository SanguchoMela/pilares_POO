package Herencia;

public class Felino {
    private String nombre;

    public Felino(){}

    public Felino(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void cazar(){
        System.out.println("\t"+getNombre()+" esta cazando");
    }
}
