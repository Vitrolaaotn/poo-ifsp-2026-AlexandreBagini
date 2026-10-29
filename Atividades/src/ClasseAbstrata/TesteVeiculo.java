package ClasseAbstrata;

public class TesteVeiculo {
    static void main() {
        Carro c= new Carro();
        Veiculo v= c;
        v.acelerar();
    }
}
