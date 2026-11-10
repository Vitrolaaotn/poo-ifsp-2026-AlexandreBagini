package Adapter;

public class ControleDePontoNovo {
    public void registrarPonto(Funcionario f, boolean entrada){
        if (entrada){
            System.out.println("C2) Entrada: "+ f.getNome());
        }else {
            System.out.println("C2) Saida: " +f.getNome());
        }
    }
}
