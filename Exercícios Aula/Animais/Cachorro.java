package Animais;

public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome); // passa para o construtor da classe Animal
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz: Au Au!");
    }
}
