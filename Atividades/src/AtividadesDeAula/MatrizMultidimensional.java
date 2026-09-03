package AtividadesDeAula;

public class MatrizMultidimensional {
    public static void main(String[] args) {
        //int [][] valores = new int[3][3]; OU
        int [][] valores = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};


        for(int lin = 0; lin < valores.length; lin++){
            for(int colu =0; colu <valores[lin].length; colu++){
                System.out.print(valores[lin][colu] + " ");

            }
            System.out.println(" ");
        }

    }
}
