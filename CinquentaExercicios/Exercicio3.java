package CinquentaExercicios;
import java.time.Year;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        int anoAtual = Year.now().getValue();
        int idadeAproximada = anoAtual - anoNascimento;

        System.out.println();
        System.out.println("Ano atual: " + anoAtual);
        System.out.println("Sua idade aproximada e: " + idadeAproximada + " anos.");

        scanner.close();
    }
}
