import java.util.Locale;
import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        System.out.print("Digite a presenca do aluno (%): ");
        double presenca = scanner.nextDouble();

        if (nota >= 7 && presenca >= 75) {
            System.out.println("Aprovado.");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperacao.");
        } else {
            System.out.println("Reprovado.");
        }

        scanner.close();
    }
}
