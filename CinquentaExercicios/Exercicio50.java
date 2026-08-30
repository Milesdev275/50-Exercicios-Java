import java.util.Locale;
import java.util.Scanner;

public class Exercicio50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Planos de assinatura:");
        System.out.println("1 - Basico - R$ 29,90 por mes");
        System.out.println("2 - Intermediario - R$ 59,90 por mes");
        System.out.println("3 - Premium - R$ 99,90 por mes");

        System.out.print("Escolha o plano: ");
        int plano = scanner.nextInt();

        System.out.print("Digite a quantidade de meses: ");
        int meses = scanner.nextInt();

        String nomePlano;
        double valorMensal;

        switch (plano) {
            case 1:
                nomePlano = "Basico";
                valorMensal = 29.90;
                break;
            case 2:
                nomePlano = "Intermediario";
                valorMensal = 59.90;
                break;
            case 3:
                nomePlano = "Premium";
                valorMensal = 99.90;
                break;
            default:
                System.out.println("Plano invalido.");
                scanner.close();
                return;
        }

        double valorSemDesconto = valorMensal * meses;
        double percentualDesconto = 0;

        if (meses >= 12) {
            percentualDesconto = 10;
        }

        double valorDesconto = valorSemDesconto * percentualDesconto / 100;
        double valorFinal = valorSemDesconto - valorDesconto;

        System.out.println();
        System.out.println("Nome do plano: " + nomePlano);
        System.out.println("Valor mensal: R$ " + valorMensal);
        System.out.println("Quantidade de meses: " + meses);
        System.out.println("Valor sem desconto: R$ " + valorSemDesconto);
        System.out.println("Valor do desconto: R$ " + valorDesconto);
        System.out.println("Valor final do contrato: R$ " + valorFinal);

        scanner.close();
    }
}
