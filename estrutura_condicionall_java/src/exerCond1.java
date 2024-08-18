import java.util.Locale;
import java.util.Scanner;

public class exerCond1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite aqui um número: ");
        int num = scanner.nextInt();

        if (num < 0 ){
            System.err.println("Número negativo");
        }
        else {
            if (num == 0) {
                System.out.println("O número digitado é zero");
            }
            else {
                System.out.println("Número positivo");
            }
        }

        scanner.close();
    }
}
