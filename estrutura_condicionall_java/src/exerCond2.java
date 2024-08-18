import java.util.Locale;
import java.util.Scanner;

public class exerCond2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite aqui um número para descobrir se ele é par ou ímpar: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número digitado é par");
        }
        else {
            System.out.println("O número digitado é ímpar");
        }



        scanner.close();
    }
}
