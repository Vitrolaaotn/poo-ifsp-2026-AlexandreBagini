package AtividadeSemana11;

import java.util.ArrayList;

public class Teste {
    public static void main() {
        Cachorro dog = new Cachorro(30.0 ,"Faisca");
        Gato cat = new Gato(10.0, "Roberto");
        Pato duck = new Pato(5.0, "Patão");
        Radio r= new Radio();




        ArrayList<Sonoro> barulhentos = new ArrayList<>();
        barulhentos.add(dog);
        barulhentos.add(cat);
        barulhentos.add(duck);
        barulhentos.add(r);

        for (Sonoro i : barulhentos){
            i.emitirSom();
        }
    }
}
