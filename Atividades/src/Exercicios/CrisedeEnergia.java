package Exercicios;

import java.util.Scanner;

public class CrisedeEnergia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int resto = 0;

        System.out.println("Numero de regioes: ");
        int N = scan.nextInt();
        if(13 <= N && N <=100){
            int [] res = new int[N];
            res[0] = 1;
            System.out.println("Salto: ");
            int m = scan.nextInt();
            boolean [] Energia = new boolean[N];
            for(int i = 0; i < N; i++){
                res[i] = res[i] + m;
                if(res[i] > N){
                    resto= res[i] - m;
                    m++;
                    res[i] = resto + m;
                }
                else if(res[i] == res[i-1]){
                    m++;
                    res[i] = res[i] + m;
                }

                else if(res[i] < N){
                    res[i] = res[i] + m;
                }


            }
            for (int resultado : res) {
                System.out.println(resultado);
            }
        }




    }
}
