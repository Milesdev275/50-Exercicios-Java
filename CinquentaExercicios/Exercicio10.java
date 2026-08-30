package CinquentaExercicios;

import java.util.Locale;
import java.util.Scanner;


public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o nome do funcionario: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o cargo do funcionario: ");
        String cargo = scanner.nextLine();

        System.out.print("Digite o salario do funcionario: ");
        double salario = scanner.nextDouble();
        scanner.nextLine(); // limpa o buffer após ler o double

        System.out.print("O funcionario esta ativo na empresa? (true/false): ");
        boolean ativo = scanner.nextBoolean();

        System.out.println();
        System.out.println("Funcionario: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: R$ " + salario);
        System.out.println("Situacao: " + (ativo ? "Ativo" : "Inativo"));

        scanner.close();
    }
}
