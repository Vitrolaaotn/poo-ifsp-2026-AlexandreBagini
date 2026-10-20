package AtividadeSemana10;

import Exercicios.Entidades.Pessoa;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Gian", "42748103807", 5000, 10);




        double salario = gerente.getSalario();

        double bonus = gerente.calcularBonus();

        System.out.println("Salário: R$ " + salario);
        System.out.println("Salário com bônus: R$ " + bonus);
    }
}

