public abstract class Animal {
    private String nome;

    // Construtor
    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract void emitirSom();
}
