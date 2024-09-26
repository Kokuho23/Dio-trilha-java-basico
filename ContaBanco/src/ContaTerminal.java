
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da sua Conta");
        int numero = scanner.nextInt();

        System.out.println("Digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Por favor, digite o valor que deseja depositar");
        double valor = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + ", e seu saldo é de R$" + valor + " e já está disponível para saque");
    }
}
