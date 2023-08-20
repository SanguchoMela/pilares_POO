package Herencia;

public class RegistroFelinos {
    public static void main(String[] args) {
        Leon miLeon = new Leon("Felix","rojiza");
        Puma miPuma = new Puma("Benito","pardo grisaceo");

        miLeon.cazar();
        miLeon.liderarManada();
        System.out.println();
        miPuma.cazar();
        miPuma.nadar();
    }
}
