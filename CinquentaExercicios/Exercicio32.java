import java.util.Locale;
import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        if (nota >= 9) {
            System.out.println("Excelente.");
        } else if (nota >= 7) {
            System.out.println("Bom.");
        } else if (nota >= 5) {
            System.out.println("Recuperacao.");
        } else {
            System.out.println("Reprovado.");
        }

        scanner.close();
    }
}
