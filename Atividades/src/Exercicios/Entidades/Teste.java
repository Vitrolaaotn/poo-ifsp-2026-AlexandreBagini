package Exercicios.Entidades;

public class Teste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.alterarNome("Gian Li");
        p1.alterarIdade(21);
        System.out.println(p1.qualSeuNome());
        System.out.println(p1.qualSuaIdade());
        System.out.println((p1.qualUltimoNome()));


    }
}
