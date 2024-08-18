import java.util.Locale;
import java.util.Scanner;

public class exerRepFor3 {

	public static void main(String[] args) {
        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite aqui quantidade de vezes: ");
        int n = sc.nextInt();

        for (int i = 1 ; i <=n ; i++) {
            System.out.printf("Digite aqui a %dª sequência de valores: ", i);
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            
            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
            System.out.printf("A média é: %.1f%n", media);
        }

		
		sc.close();
	}
}