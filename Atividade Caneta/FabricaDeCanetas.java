public class FabricaDeCanetas {
    public static Caneta3 criarAzul() {
        return new Caneta3("Azul", 0.5);
    }

    public static Caneta3 criarPreta() {
        return new Caneta3("Preta", 1.0);
    }
}
