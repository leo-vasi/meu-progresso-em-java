import java.util.Locale;
import java.util.Scanner;

public class exerRepFor4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite aqui a quantidade de vezes que deseja usar este algoritmo: ");
        int n = sc.nextInt();

        for (int i = 1 ; i <= n ; i ++) {
            System.out.print("Digite aqui o número que deseja dividir: ");
            int x = sc.nextInt();
            System.out.print("Digite aqui por qual número deseja dividir: ");
            int y = sc.nextInt();
            if (y == 0) {
                System.out.println("Divisão impossível");
            }
            else {
                double div = (double) x / y;
                System.out.printf("O resultado da divisão é: %.2f%n", div);
            }
        }


        sc.close();
    }
}
