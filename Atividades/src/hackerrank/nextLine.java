package hackerrank;

    import java.util.Scanner;

    public class nextLine {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int i = scan.nextInt();
            double d = scan.nextDouble();
            scan.nextLine(); //Se você utilizar o metodo nextLine() logo após o metodo nextInt(), lembre-se de que o nextInt() lê tokens do tipo inteiro por isso, o caractere de nova linha final daquela linha de entrada de inteiro permanece na fila do buffer de entrada, e a próxima chamada de nextLine() lerá o restante da linha do inteiro (que está vazio).

            String  s = scan.nextLine();

            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);
        }
    }

