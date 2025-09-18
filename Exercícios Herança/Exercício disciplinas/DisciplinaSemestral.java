public class DisciplinaSemestral extends Disciplina {
    protected double nota3;

    public void avaliacao() {
        notaFinal = (nota1 + nota2 + nota3) / 3.0;
        System.out.println("Nota SEMESTRAL da disciplina " + nome + ": " + notaFinal);
    }

    public void setNota3(float nota3){
        this.nota3 = nota3;
    }

    public void exibir(){
        System.err.println();
    }
}
