package Ex7;

public class Main {
    public static void main(String[] args) {
        Celular celular = new Celular();
        celular.setFabricante("Apple");
        celular.setNumeroSerie("SN123456");

        System.out.println("Fabricante: " + celular.getFabricante());
        System.out.println("Número de Série: " + celular.getNumeroSerie());
    }
}

