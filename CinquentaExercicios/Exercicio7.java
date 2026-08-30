package CinquentaExercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o valor que voce ganha por hora: ");
        double valorHora = scanner.nextDouble();

        System.out.print("Digite quantas horas voce trabalhou no mes: ");
        double horasTrabalhadas = scanner.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;

        System.out.println();
        System.out.println("Salario bruto do mes: R$ " + salarioBruto);

        scanner.close();
    }
}
