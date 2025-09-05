public class Mesa {
    private Caneta3 canetaFavorita;

    public Mesa(Caneta3 caneta) {
        this.canetaFavorita = caneta;
    }

    public void usarCaneta(String texto) {
        canetaFavorita.escrever(texto);
    }
}
