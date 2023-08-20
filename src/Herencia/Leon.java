package Herencia;

public class Leon extends Felino{
    private String melena;

    public Leon() {
        super();
    }

    public Leon(String nombre, String melena) {
        super(nombre);
        this.melena = melena;
    }

    public String getMelena() {
        return melena;
    }

    public void setMelena(String melena) {
        this.melena = melena;
    }

    public void liderarManada(){
        System.out.println("\t"+getNombre()+" esta liderando la manada");
    }
}
