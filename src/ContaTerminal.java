import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite sua Conta: ");
            int conta = scanner.nextInt();

            System.out.print("Digite o número da Agência: ");
            String agencia = scanner.next();

            System.out.print("Digite nome do Cliente: ");
            String nomeConta = scanner.next();

            System.out.print("Digite o Saldo: ");
            double saldo = scanner.nextDouble();

            System.out.println("Nome do Cliente: " + nomeConta);
            System.out.println("Conta número: " + conta);
            System.out.println("Agência número: " + agencia);
            System.out.println("Saldo: " + saldo);

        }catch (InputMismatchException exception) {
            System.out.println("Neste campo só é permitido número: " );
        }
    }
}
