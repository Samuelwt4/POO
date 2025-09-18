package Ex10;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setNomeEscola("AMF");
        professor.setMateria("POO");

        System.out.println("Escola: " + professor.getNomeEscola());
        System.out.println("Matéria: " + professor.getMateria());
    }
}

