package Exercicios;
import java.util.ArrayList;
import java.util.Collections;
public class ExArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> valores = new ArrayList<>();
        valores.add(10);
        int valor = valores.get(valores.size()-1);
        System.out.println(valor);
        System.out.println(valores.size()); // mostra o tamanho do arraylist

        for(Integer v: valores){
            System.out.println(v);
        }

        ArrayList<String> bandas = new ArrayList<>();
        bandas.add("Slipknot");
        bandas.add("RedHotChilliPeppers");
        bandas.add("System Of Down");
        bandas.add("Avenged Sevenfold");
        bandas.add("Evanescence");
        bandas.add("Guns'Roses");


        Collections.sort(bandas);
        for(String banda : bandas){
            System.out.println(banda);
        }
    }
}
