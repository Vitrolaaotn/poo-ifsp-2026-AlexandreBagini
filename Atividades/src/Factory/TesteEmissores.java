package Factory;

public class TesteEmissores {
    public static void main(String[] args) {
            Emissor email = new EmissorEmail();
            email.enviar("Olá. Seu agendamento foi concluido.");
            Emissor sms= new EmissorSMS();
            sms.enviar("Que horas são?");

    }
}
