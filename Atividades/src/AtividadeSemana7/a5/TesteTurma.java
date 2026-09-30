package AtividadeSemana7.a5;

public class TesteTurma {
    public static void main(String[] args) {
        Turma turma = new Turma();
        turma.matricular(new Aluno("Ana", 8.5));
        turma.matricular(new Aluno("Bruno", 6.0));
        turma.matricular(new Aluno("Carla", 9.2));
        turma.matricular(new Aluno("Diego", 7.3));

        System.out.println("Média: " + turma.calcularMedia());

        Aluno melhor = turma.encontrarMelhorAluno();
        System.out.println("Melhor aluno: " + melhor.getNome());

        Turma vazia = new Turma();
        System.out.println("Média da turma vazia: " + vazia.calcularMedia());
    }
}
