package AtividadesDeAula.Semana08Exercicios;

public class Variancia {
    public static double Variancia(double [] valores){
        double media = Media.Media(valores);
        double v= 0;
        for (int i = 0; i < valores.length; i++){
            v += Math.pow(valores[i]-media, 2);

        }
        return v/valores.length;

    }
}
