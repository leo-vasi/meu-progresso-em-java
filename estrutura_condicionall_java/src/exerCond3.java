import java.util.Locale;
import java.util.Scanner;

public class exerCond3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite aqui um valor para A: ");
        int a = scanner.nextInt();

        System.out.println("Digite aqui um valor para B: ");
        int b = scanner.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("São múltiplos");
        }
        else {
            System.out.println("Não são múltiplos");
        }



        scanner.close();
    }
}
