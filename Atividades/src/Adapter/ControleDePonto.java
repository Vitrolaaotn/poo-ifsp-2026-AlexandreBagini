package Adapter;

public class ControleDePonto {
    public void registrarEntrada(Funcionario f){
        System.out.println("C1) Entrada: " + f.getNome());

    }
    public void registrarSaida(Funcionario f){
        System.out.println("C1) Saída: " + f.getNome());
    }
}
