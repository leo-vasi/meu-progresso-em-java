import java.util.Locale;
import java.util.Scanner;

public class exerRepWhile3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite aqui um valor para X: ");
        int x = sc.nextInt();

        System.out.print("Digite aqui um valor para Y: ");
        int y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            }
            else if (x < 0 && y > 0) {
                System.out.println("segundo");
            }
            else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            }
            else {
                System.out.println("quarto");
            }
            y = sc.nextInt();
            x = sc.nextInt();
        }

        sc.close();
    }
}
