import java.util.Scanner;

         public class EstatisticasArray {
             public static void main(String[] args) {
             Scanner teclado = new Scanner(System.in);
             int[] valores = new int[5];

             for (int i = 0; i < valores.length; i++) {
                 System.out.print("Digite o valor " + (i + 1) + ": ");
                 valores[i] = teclado.nextInt();
             }

            int soma = 0;
             int maior = 0;
            for (int i = 0; i <valores.length; i++){
                soma= soma+valores[i];
                if (valores[i]>maior){
                    maior=valores[i];
                }
            }

             double media = (double) soma / valores.length;

             System.out.println("Soma: " + soma);
             System.out.println("Media: " + media);
             System.out.println("Maior elemento: " + maior);
             }
     }