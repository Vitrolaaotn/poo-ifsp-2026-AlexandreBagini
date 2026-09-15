package Exercicios.Encapsulamento;

public class TesteProduto {
    public static void main(String[] args){
        Produto p1 = new Produto();
        p1.setNome("salgado") ;
        p1.setPreco(50);

        System.out.println(p1.getNome());
        System.out.println(p1.getPreco());

    }

}
