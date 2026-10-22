package Teste;

import Modelo.Funcionario;

public class TesteFuncionario {
    public static void main(String[] args){
        Funcionario f = new Funcionario("Ana", "123", 5000);
        System.out.println(f.toString());
    }
}
