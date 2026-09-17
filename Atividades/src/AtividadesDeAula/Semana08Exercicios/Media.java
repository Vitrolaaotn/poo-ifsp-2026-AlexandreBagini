package AtividadesDeAula.Semana08Exercicios;

import java.util.Scanner;

public class Media {
    public static double Media(double [] valores){
        double soma = 0;
        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }

        double media = soma / valores.length;

        return media;
    }
}


