package AtividadeSemana11;

public class Gato  extends Animal {
    public Gato (double peso, String nome){
        super (peso, nome);
    }

    @Override
    public void emitirSom(){
        System.out.println("Miau ");;
    }
}
