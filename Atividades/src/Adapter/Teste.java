package Adapter;

public class Teste {
    static void main(String[] args) {
        ControleDePonto ponto = new ControleDePonto();
        Funcionario funcionario = new Funcionario("Teobaldo");

        ControleDePontoAdapter novo = new ControleDePontoAdapter();


        novo.registrarEntrada(funcionario);
        novo.registrarSaida(funcionario);
    }
}
