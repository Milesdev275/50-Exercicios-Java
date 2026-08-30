import java.util.Locale;
import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o valor da compra: ");
        double valor = scanner.nextDouble();

        if (valor >= 150) {
            System.out.println("Frete gratis.");
        } else {
            System.out.println("Frete de R$ 20,00.");
        }

        scanner.close();
    }
}
