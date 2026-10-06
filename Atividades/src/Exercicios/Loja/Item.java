package Exercicios.Loja;

public class Item {
    private String produto;
    private double preco;
    private int qtde;


}


public void setPreco(double preco){
    this.preco=preco;
}
public double getPreco(double preco){
    return this.preco;
}
public void setProduto(String produto){
    this.produto=produto;
}
public String getProduto(String produto){
    return produto;
}

public double totalItem(double preco, int qtde){
    return preco*qtde;
}