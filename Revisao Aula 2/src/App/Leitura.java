package App;

import java.util.Scanner;

//Leitura do teclado
public class Leitura {
    public static void main(String[] args){
        //teclado é uma variável do tipo Scanner
        // teclado é um objeto da classe Scanner
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número inteiro:");
        int valor = teclado.nextInt();
        System.out.println("O valor digitado foi "+ valor);
    }
}
