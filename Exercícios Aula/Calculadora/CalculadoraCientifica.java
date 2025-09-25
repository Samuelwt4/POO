public class CalculadoraCientifica extends CalculadoraBase {

    public double somar(double a, double b) {
        return a + b;
    }

    public int somar(int... valores) {
        int soma = 0;
        for (int v : valores) {
            soma += v;
        }
        return soma;
    }

    public String somar(String a, String b) {
        return a + b;
    }
}
