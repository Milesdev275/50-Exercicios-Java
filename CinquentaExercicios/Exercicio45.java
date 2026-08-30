import java.util.Locale;
import java.util.Scanner;

public class Exercicio45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o salario do funcionario: ");
        double salario = scanner.nextDouble();

        double bonus = (salario < 3000) ? 500 : 200;
        double valorTotal = salario + bonus;

        System.out.println("Salario: R$ " + salario);
        System.out.println("Bonus: R$ " + bonus);
        System.out.println("Valor total: R$ " + valorTotal);

        scanner.close();
    }
}
