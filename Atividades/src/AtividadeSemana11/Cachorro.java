package AtividadeSemana11;

public class Cachorro extends Animal{

    public Cachorro (double peso, String nome){
        super (peso, nome);
    }

    @Override
    public void emitirSom(){
        System.out.println("Au Au");;
    }
}
