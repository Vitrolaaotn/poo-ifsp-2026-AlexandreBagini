package AtividadeSemana11;

public class Pato  extends Animal{
    public Pato (double peso, String nome){
        super (peso, nome);
    }

    @Override
    public void emitirSom(){
        System.out.println("Quack Quack");;
    }
}
