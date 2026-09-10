package Exercicios.Entidades;

public class TesteCarro {
    public static void main (String[] args){
        //default => ele é privado fora do package por padrão
        //public => classe é publica, é possível ser acessada e modificada
        //private => a classe é privada n pode ser modificada
        //protected => Herança
        //Todos esses atributos fazem parte do Encapsulamento / hidding information
        Carro c1 = new Carro();
        c1.modelo = "corsa";
    }
}
