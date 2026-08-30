import java.util.Locale;
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite a porcentagem de presenca do aluno: ");
        double presenca = scanner.nextDouble();

        if (presenca >= 75) {
            System.out.println("Presenca suficiente.");
        }

        scanner.close();
    }
}
