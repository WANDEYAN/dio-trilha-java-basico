import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, Informe seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, Informe o número da sua Agência: ");
        agencia = scanner.nextLine();

        System.out.println("Por favor, Informe o número da sua Conta: ");
        numero = scanner.nextInt();

        System.out.println("Por favor, Informe o saldo da sua Conta: ");
        saldo = scanner.nextDouble();

        scanner.close();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque%n",
                nomeCliente, agencia, numero, saldo);
    }
}