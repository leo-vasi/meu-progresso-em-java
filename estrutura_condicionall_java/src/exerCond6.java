import java.util.Locale;
import java.util.Scanner;

public class exerCond6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite aqui um valor qualquer: ");
        double valor = scanner.nextDouble();

        if (valor < 0.0 || valor > 100.0) {
            System.out.println("Valor fora de intervalo");
        }
        else if (valor <= 25.0) {
            System.out.println("Intervalo entre 0 e 25");
        }
        else if (valor <= 50.0) {
            System.out.println("Valor entre 25 e 50");
        }
        else if (valor <= 75) {
            System.out.println("Valor entre 50 e 75");
        }
        else {
            System.out.println("Valor entre 75 e 100");
        }

        scanner.close();
    }
}
