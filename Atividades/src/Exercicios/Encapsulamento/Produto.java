package Exercicios.Encapsulamento;

public class Produto{
    private double preco;
    private String nome;


    public void setNome(String n) {
        if(n == null || n.isBlank()){
//          System.err.println("Campo Nome não foi preenchido corretamente, preço inválido");
        }
        else{
            nome= n;
        }

    }

    public void setPreco(double p){
        if (p <=0 ){
            System.err.println("Campo Nome não foi preenchido corretamente, preço inválido");
        }
        else {
            preco = p;
        }
    }

    public String getNome(){

        return nome;
    }
    public double getPreco(){
        return preco;
    }
}
