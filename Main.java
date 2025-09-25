public class Main {

    public static void main(String[] args) {
        Animal[] animais = {new Cachorro("rex  "), new Gato("mimi    ")};
        for(Animal a : animais)
            a.emitirSom();
    }
}
