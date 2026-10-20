package AtividadeSemana10;

public class TesteFuncionarios {
    public static void main(String[] args) {
        Gerente g = new Gerente("Ana", "111.111.111-11", 8000.0, 5);
        Desenvolvedor d = new Desenvolvedor("Bruno", "222.222.222-22", 6000.0, "Java");


        String nome1 = d.getNome();
        String nome2 = g.getNome();

        double bonus = g.calcularBonus();
        double bonus2 =d.calcularBonus();

        System.out.println(nome1 + " " + bonus2);
        System.out.println(nome2 + " " + bonus);

        System.out.println(g);
    }



}
