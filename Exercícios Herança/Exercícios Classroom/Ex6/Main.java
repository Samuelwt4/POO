package Ex6;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();

        gerente.setNome("Carlos Silva");
        gerente.setDepartamento("Recursos Humanos");

        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Departamento: " + gerente.getDepartamento());
    }
}
