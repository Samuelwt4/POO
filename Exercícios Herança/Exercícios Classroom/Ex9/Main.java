package Ex9;

public class Main {
    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        notebook.setProcessador("Intel i5");
        notebook.setPeso(1.8);

        System.out.println("Processador: " + notebook.getProcessador());
        System.out.println("Peso: " + notebook.getPeso() + " kg");
    }
}
