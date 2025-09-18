public class DisciplinaTrimestral extends Disciplina {
    public void avaliacao() {
        notaFinal = (nota1 * 0.4) + (nota2 * 0.6);
        System.out.println("Nota TRIMESTRAL da disciplina " + nome + ": " + notaFinal);
    }
}
