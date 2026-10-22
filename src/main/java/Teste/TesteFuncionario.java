package Teste;

import Modelo.Desenvolvedor;
import Modelo.Funcionario;
import Modelo.Gerente;

import java.util.ArrayList;

public class TesteFuncionario {
    public static void main(String[] args){
        Gerente gerente = new Gerente("Ana", "123", 15000, 10);

        Desenvolvedor dev1 = new Desenvolvedor("Jones" ,"456", 3000, "Java");
        Desenvolvedor dev2= new Desenvolvedor("Gian", "789", 4000, "Python");

        Funcionario office = new Funcionario("Alexandre", "12356", 20000);

        ArrayList<Funcionario> equipe = new ArrayList<>();
        equipe.add(dev1);
        equipe.add(office);
        equipe.add(gerente);
        equipe.add(dev2);

        for(Funcionario f: equipe){
            System.out.println("=".repeat(10));
            System.out.println(f.toString());

        }

        double totalFolha =0.0;
        for(Funcionario f:equipe){
            double salario = f.getSalario();
            totalFolha = totalFolha +salario;
            System.out.println(f.getNome() + " => " + salario);
        }
        System.out.println("TOTAL => " + totalFolha);
    }
}
