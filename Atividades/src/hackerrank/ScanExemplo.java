package hackerrank;

import java.util.Scanner;

//Leitura do teclado
public class ScanExemplo {
    public static void main(String[] args){
        //teclado é uma variável do tipo Scanner
        // teclado é um objeto da classe Scanner
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número inteiro:");
        //double valor = teclado.nextDouble();
        //boolean valor= teclado.nextBoolean();
        int valor = teclado.nextInt();
        System.out.println("O valor digitado foi "+ valor);
    }
}