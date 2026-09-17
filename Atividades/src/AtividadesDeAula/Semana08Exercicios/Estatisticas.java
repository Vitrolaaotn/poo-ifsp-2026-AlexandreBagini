package AtividadesDeAula.Semana08Exercicios;

import java.util.Arrays;
import java.util.Scanner;

// Criar a classe Estatistica e os métodos estáticos
// a)double media(double [] valores
// b) double variância (double []valores) Mathpow
// c) double desvioPadrao (double [] valores) Mathsqrt
public class Estatisticas {
    public static void main(String[] args){
        double[] valores = {10, 20, 30, 40, 50};

        System.out.println(Media.Media(valores));
        System.out.println(Variancia.Variancia(valores));
        System.out.println(DesvioPadrao.DesvioPadrao(valores));
    }


}
