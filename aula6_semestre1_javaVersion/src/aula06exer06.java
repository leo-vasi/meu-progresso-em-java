import java.util.Locale;
import java.util.Scanner;

public class aula06exer06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // Calculando se há execesso
        System.out.print("Digite aqui o peso do peixe: ");
        double peixe = sc.nextDouble();

        double imposto = peixe - 50;
        double pagar = imposto * 4;
        if (peixe < 0 ) {
            System.out.print("Erro, valor invalido.");
        }
        else if (peixe < 50 ) {
            System.out.print("O peso não execede.");
        }
        else {
            System.out.printf("O valor a ser pago é: %.2f", pagar);
        }

        sc.close();
    }
}
