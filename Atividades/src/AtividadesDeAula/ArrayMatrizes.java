package AtividadesDeAula;

import java.util.Arrays;

public class ArrayMatrizes {
    public static void main(String[] args) {
        // tipo [] nome = new tipo [tamanho]
        boolean [] sensores = new boolean[5];
        // 4º posição para true
        sensores[3] = true;
        //for (inicio; condição de parada; passo)
        for(int i=0; i < sensores.length; i++){
            sensores[i]=true;
            System.out.println(sensores[i]);
        }
        //É possivel converter o tipo do array
        System.out.println(Arrays.toString(sensores));

        //for enhanced
        // for (variavel : array)
        for (boolean sensor :sensores){
            //System.out.println(sensores [i]);

        }
    }

}
