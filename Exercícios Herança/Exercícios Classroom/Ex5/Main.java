package Ex5;
public class Main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();

        conta.setSaldo(2000.00);
        conta.setLimite(1000.00);

        System.out.println("Saldo: R$ " + conta.getSaldo());
        System.out.println("Limite: R$ " + conta.getLimite());
    }
}
