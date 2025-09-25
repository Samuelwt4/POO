public class Main {
    public static void main(String[] args) {
        CalculadoraBase base = new CalculadoraBase();
        System.out.println("Soma Base (int, int): " + base.somar(5, 3));

        CalculadoraCientifica cientifica = new CalculadoraCientifica();
        System.out.println("Soma Científica (int, int): " + cientifica.somar(10, 7));
        System.out.println("Soma Científica (double, double): " + cientifica.somar(5.5, 2.3));
        System.out.println("Soma Científica (varargs): " + cientifica.somar(1, 2, 3, 4, 5));
        System.out.println("Soma Científica (String concat): " + cientifica.somar("Hello, ", "World!"));
    }
}
