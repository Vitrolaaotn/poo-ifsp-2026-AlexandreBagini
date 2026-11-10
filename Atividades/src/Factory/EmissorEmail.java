package Factory;

public class EmissorEmail implements Emissor{

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando e-mal: " + mensagem);
    }
}
