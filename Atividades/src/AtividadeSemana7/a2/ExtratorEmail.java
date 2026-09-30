package AtividadeSemana7.a2;

public class ExtratorEmail {
    public static void main(String[] args) {
        String email = "alexandre.bagini@aluno.ifsp.edu.br";

        int pos = email.indexOf('@');

        if (pos == -1) {
            System.out.println("E-mail inválido!");
            return;
        }

        String usuario = email.substring(0, pos);
        String dominio = email.substring(pos + 1);

        System.out.println("Usuário: " + usuario);
        System.out.println("Domínio: " + dominio);

        if (dominio.contains("ifsp")) {
            System.out.println("E-mail institucional");
        } else {
            System.out.println("E-mail externo");
        }
    }
}
