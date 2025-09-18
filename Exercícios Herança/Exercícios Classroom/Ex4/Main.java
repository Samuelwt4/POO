package Ex4;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.setPreco(59.90);
        livro.setAutor("Desconhecido");
        livro.setTitulo("Diário de um banana");

        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Preço: R$ " + livro.getPreco());
    }
}
