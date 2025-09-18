package Ex8;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Samuel");
        cliente.setCidade("São Paulo");

        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Cidade: " + cliente.getCidade());
    }
}

