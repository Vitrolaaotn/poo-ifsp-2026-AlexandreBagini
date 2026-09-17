package AtividadesDeAula.Semana08Exercicios;

public class DesvioPadrao {
    public static double DesvioPadrao(double [] valores){
         double variancia = Variancia.Variancia(valores);
         return Math.sqrt(variancia);
    }



}
