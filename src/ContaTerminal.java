import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite nome do Cliente: ");
        String nomeConta = scanner.nextLine();

        System.out.print("Digite o Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.print("Digite sua Conta; ");
        int conta = scanner.nextInt();

        System.out.println("Nome do Cliente: " + nomeConta);
        System.out.println("Conta número: " + conta);
        System.out.println("Agência número: " + agencia);
        System.out.println("Saldo: " + saldo);

    }
}
