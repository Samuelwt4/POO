public class DisciplinaAnual extends Disciplina {
    protected double nota3;
    protected double nota4;
    protected double nota5;
    protected double nota6;

    public void avaliacao() {
        notaFinal = ((nota1 + nota2 + nota3 + nota4 + nota5) / 5.0 * 0.6) + (nota6 * 0.4);
        System.out.println("Nota ANUAL da disciplina " + nome + ": " + notaFinal);
    }
}