import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        if (saldo > 0) {
            System.out.println("Voce possui saldo disponivel.");
        }

        scanner.close();
    }
}
