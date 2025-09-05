public class Caneta3 {
    private String cor;
    private double espessura;

    public Caneta3(String cor, double espessura) {
        this.cor = cor;
        this.espessura = espessura;
    }

    public void escrever(String texto) {
        System.out.println("[" + cor + "] -> " + texto);
    }

    public String getCor() { return cor; }
    public double getEspessura() { return espessura; }
}
