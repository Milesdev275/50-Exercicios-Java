import java.util.Locale;
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite a velocidade do veiculo: ");
        double velocidade = scanner.nextDouble();

        if (velocidade > 80) {
            System.out.println("Voce foi multado.");
        }

        scanner.close();
    }
}
