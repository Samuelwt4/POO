package Ex2;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setEspecie("Canina");
        cachorro.setRaca("Beagle");

        System.out.println("Espécie: " + cachorro.getEspecie());
        System.out.println("Raça: " + cachorro.getRaca());
    }
}


