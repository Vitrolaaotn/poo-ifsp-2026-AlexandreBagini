package Exercicios.Entidades;

public class Teste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Gian Li");
        p1.setIdade(21);
        System.out.println(p1.getNome());
        System.out.println(p1.getIdade());
        System.out.println((p1.getUltimoNome()));

        Pessoa p2 = new Pessoa(50);
        System.out.println(p2.getIdade());

        Pessoa p3 = new Pessoa("Alberto");
        System.out.println(p3.getNome());
    }
}
