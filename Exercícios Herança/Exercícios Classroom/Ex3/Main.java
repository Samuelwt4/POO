package Ex3;
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setMarca("Honda");
        carro.setModelo("Civic");

        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: "  + carro.getModelo());
    }
}
