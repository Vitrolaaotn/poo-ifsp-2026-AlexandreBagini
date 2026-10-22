package Modelo;

public class Desenvolvedor extends Funcionario{
    private String linguagemPrincipal;

    private Desenvolvedor(){

    }

    @Override
    public String toString() {
        String mensagem = super.toString();
        return "Desenvolvedor\n" + mensagem + "linguagem: " + linguagemPrincipal;
    }
}
