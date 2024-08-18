import java.util.Locale;
import java.util.Scanner;

public class exer0 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite aqui a largura: ");
        double largura = scanner.nextDouble();

        System.out.print("Digite aqui o comprimento: ");
        double comprimento = scanner.nextDouble();

        System.out.print("Digite aqui o valor por metro quadrado: ");
        double valor = scanner.nextDouble();

        double area = comprimento * largura;

        double valorTotal = area * valor;

        System.out.printf("Área: %.2f%n Valor total: %.2f", area, valorTotal);


        scanner.close();
    }
}
