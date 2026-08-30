import java.util.Locale;
import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        String resultado = (nota >= 7) ? "Aprovado." : "Reprovado.";

        System.out.println(resultado);

        scanner.close();
    }
}
