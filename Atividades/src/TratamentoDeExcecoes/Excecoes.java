package TratamentoDeExcecoes;

public class Excecoes {
    public static void main(String[] args) {
        System.out.println("Inicio do Main");
        metodo1();
        System.out.println("Fim do Main");
    }
    public static void metodo1(){
        System.out.println(">> Inicio do metodo 1");
        metodo2();
        System.out.println(">> Fim do metodo 1");
    }
    public static void metodo2(){
        System.out.println(">>>> Inicio do metodo 2");
        int[] array = new int[10];
        try {
            for (int i = 0; i <= 15; i++) {
                array[i] = i;
                System.out.println("\t" + i);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch (Exception e){

        }
        System.out.println(">>>> Fim do metodo 2");

    }
}
