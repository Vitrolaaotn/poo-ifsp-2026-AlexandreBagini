package Exercicios.Loja;
import java.time.LocalDate;

public class Pedido {
    private int id;
    private LocalDate date;
    private double total;

}


public double totalPedido(double total, int qtde){
    total+= totalItem();
}