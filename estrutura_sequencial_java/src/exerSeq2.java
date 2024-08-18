import java.util.Locale;
import java.util.Scanner;
public class exer2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite aqui o raio do círculo do qual deseja descobrir a área: ");
        double raio = scanner.nextDouble();
        double pi = 3.14159;
        double area = pi * raio * raio;
        System.out.printf("A área do raio é: %.4f %n", area);
        scanner.close();
    }
}
