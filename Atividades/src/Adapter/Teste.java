package Adapter;

public class Teste {
    static void main(String[] args) {
        ControleDePonto ponto = new ControleDePonto();
        Funcionario funcionario = new Funcionario("Teobaldo");

        ponto.registrarEntrada(funcionario);
        ponto.registrarSaida(funcionario);
    }
}
