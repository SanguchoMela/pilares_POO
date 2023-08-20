package Herencia;

public class Puma extends Felino{
    private String coloracion;

    public Puma(){
        super();
    }

    public Puma(String nombre, String coloracion) {
        super(nombre);
        this.coloracion = coloracion;
    }

    public String getColoracion() {
        return coloracion;
    }

    public void setColoracion(String coloracion) {
        this.coloracion = coloracion;
    }

    public void nadar(){
        System.out.println("\t"+getNombre()+" esta nadando");
    }
}
