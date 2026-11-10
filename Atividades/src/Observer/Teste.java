package Observer;

public class Teste {
    public static void main(String[] args) {
        Acao petro = new Acao("PETR4", 44.76);
        Acao vale = new Acao("VALE3", 65.11);

        Corretora xp = new Corretora("XP");
        Corretora btg = new Corretora("BTG");

        petro.registrarInteresse(xp);
        petro.registrarInteresse(btg);
        vale.registrarInteresse(btg);
        Jornal valor = new Jornal("Valor economico");
        petro.registrarInteresse(valor);

        vale.setValor(65.17);
        petro.setValor(44.66);

    }
}
