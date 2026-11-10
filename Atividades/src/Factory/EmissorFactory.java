package Factory;

public class EmissorFactory {
    public Emissor create(int tipo){
        switch (tipo){
            case EmissorFactory.EMAIL ->{
                return new EmissorEmail();
            }
            case EmissorFactory.SMS -> {
                return new EmissorSMS();
            }
            default -> {
                throw new IllegalArgumentException("Tipo de Emissor não suportado.");
            }
        }
    }
    //constantes da classe
    public static final int EMAIL = 0;
    public static final int SMS= 1;
}
