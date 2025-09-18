package Ex1;
public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setNome("Samuel");
        aluno.setIdade(20);
        aluno.setMatricula("007004");

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Matrícula: " + aluno.getMatricula());
    }
}
