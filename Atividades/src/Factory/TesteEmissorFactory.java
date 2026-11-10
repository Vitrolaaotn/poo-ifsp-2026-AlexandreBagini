package Factory;

public class TesteEmissorFactory {
    public static void main(String[] args) {
        EmissorFactory fabrica = new EmissorFactory();

        Emissor email = fabrica.create(EmissorFactory.EMAIL);
        Emissor sms = fabrica.create(EmissorFactory.SMS);

        email.enviar("Não vai acabar a aula?");
        sms.enviar("Acho que está no final");
    }
}
