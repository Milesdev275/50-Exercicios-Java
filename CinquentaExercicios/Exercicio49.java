import java.util.Locale;
import java.util.Scanner;

public class Exercicio49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Opcoes de combustivel:");
        System.out.println("1 - Gasolina - R$ 5,80");
        System.out.println("2 - Etanol - R$ 4,20");
        System.out.println("3 - Diesel - R$ 6,00");

        System.out.print("Escolha o tipo de combustivel: ");
        int tipoCombustivel = scanner.nextInt();

        System.out.print("Digite a quantidade de litros: ");
        double litros = scanner.nextDouble();

        String nomeCombustivel;
        double precoPorLitro;

        switch (tipoCombustivel) {
            case 1:
                nomeCombustivel = "Gasolina";
                precoPorLitro = 5.80;
                break;
            case 2:
                nomeCombustivel = "Etanol";
                precoPorLitro = 4.20;
                break;
            case 3:
                nomeCombustivel = "Diesel";
                precoPorLitro = 6.00;
                break;
            default:
                System.out.println("Tipo de combustivel invalido.");
                scanner.close();
                return;
        }

        double valorTotal = litros * precoPorLitro;

        System.out.println("Combustivel: " + nomeCombustivel);
        System.out.println("Litros: " + litros);
        System.out.println("Valor total a pagar: R$ " + valorTotal);

        scanner.close();
    }
}
