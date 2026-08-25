package Exercicios;

public class Inverte {
    public static void main(String[] args) {

        int[] numeros = {10, 20, 30, 40, 50};
        int tam = numeros.length;
        for(int i=1; i <= numeros.length; i++){
            System.out.println(numeros[tam-i]);

        }
    }
}
