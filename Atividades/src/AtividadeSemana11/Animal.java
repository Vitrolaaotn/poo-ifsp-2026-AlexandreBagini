package AtividadeSemana11;

public class Animal implements Sonoro {
    private double peso;
    private String nome;

    public Animal(double peso, String nome){
        this.peso = peso;
        this.nome = nome;
    }
    @Override
    public void emitirSom(){
        System.out.println("Aghr...");

    }
}
