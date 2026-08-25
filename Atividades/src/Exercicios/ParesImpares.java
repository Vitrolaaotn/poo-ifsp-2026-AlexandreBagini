package Exercicios;

import java.util.Arrays;

public class ParesImpares {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7};
        int[] pares = new int[3];
        int[] impar= new int [4];
        int x=0;
        int y=0;
        for (int i=0; i < numeros.length; i++){
            if (numeros[i]%2==0){
                pares[x] = numeros[i];
                x++;
            }
            else{
                impar[y]=numeros[i];
                y++;
            }
        }
        System.out.print("Pares: ");
        System.out.println(Arrays.toString(pares));
        System.out.print("Ímpares: ");
        System.out.println(Arrays.toString(impar));
    }
}
