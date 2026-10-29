package ClasseAbstrata;

public abstract class Veiculo {
    private double peso;

    public abstract void acelerar();

    @Override
    public String toString(){
        return "Veiculo com peso:" + peso + " kg";
    }
}
