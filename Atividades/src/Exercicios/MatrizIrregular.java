package Exercicios;

public class MatrizIrregular {
    public static void main(String[] args) {
        int [][] valores = new int [3][];
        valores[0] = new int[3];
        valores[1]= new int[2];
        valores[2]= new int[4];

        // valores.length é o número de linhas
        for(int lin = 0; lin < valores.length; lin++){
            for(int colu =0; colu <valores[lin].length; colu++){
                System.out.print(valores[lin][colu] + " ");

            }
            System.out.println(" ");
        }
    }
}
