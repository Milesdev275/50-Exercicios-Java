import java.util.Locale;
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o valor da compra: ");
        double valor = scanner.nextDouble();

        if (valor >= 100) {
            System.out.println("Cliente ganhou desconto.");
        }

        scanner.close();
    }
}
