public class Animal {
    private String nome;

    public void comer() {
        System.out.println(nome + " comeu");
    }

    public void beber() {
        System.out.println(nome + " bebeu");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
