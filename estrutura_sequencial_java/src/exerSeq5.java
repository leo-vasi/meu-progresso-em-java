import java.util.Locale;
import java.util.Scanner;

public class exer5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite aqui o código da peça 1: ");
        int peca1 = scanner.nextInt();

        System.out.print("Digite aqui o número de peças para a peça 1: ");
        int num_peca1 = scanner.nextInt();

        System.out.print("Digite aqui o valor unitário de cada peça 1: ");
        double valor_peca1 = scanner.nextDouble();

        System.out.print("Digite aqui o código da peça 2: ");
        int peca2 = scanner.nextInt();

        System.out.print("Digite aqui o número de peças para a peça 2: ");
        int num_pecas2 = scanner.nextInt();

        System.out.print("Digite aqui o valor unitário de cada peça 2: ");
        double valor_peca2 = scanner.nextDouble();

        double valorTotal = (num_peca1 * valor_peca1) + (num_pecas2 * valor_peca2); 

        System.out.printf("Código da peça 1: %d%n Código da peça 2: %d%n Quantidade de peças 1: %d%n Quantidade de peças 2: %d%n Preço unitário das peças 1: %.2f%n Preço unitário das peças 2: %.2f%n", peca1, peca2, num_peca1, num_pecas2, valor_peca1, valor_peca2);
        System.out.printf("Valor total a ser pago: R$ %.2f %n", valorTotal);

        scanner.close();
    }

}
