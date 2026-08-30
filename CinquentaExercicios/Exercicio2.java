package CinquentaExercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade do aluno: ");
        int idade = scanner.nextInt();

        System.out.print("Digite a nota final do aluno: ");
        double notaFinal = scanner.nextDouble();

        System.out.println();
        System.out.println("O aluno " + nome + ", de " + idade
                + " anos, obteve nota final " + notaFinal + ".");

        scanner.close();
    }
}

