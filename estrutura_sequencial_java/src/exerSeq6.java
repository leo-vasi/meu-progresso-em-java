import java.util.Locale;
import java.util.Scanner;

public class exer6{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double A = scanner.nextDouble();
        
        System.out.print("Digite o valor de B: ");
        double B = scanner.nextDouble();

        System.out.print("Digite o valor de C: ");
        double C = scanner.nextDouble();

        double triangulo = A * C / 2.0;

        double pi = 3.14159;

        double circulo = pi * C * C;

        double trapezio = (A + B) / 2.0 * C;

        double quadrado = B * B;

        double retangulo = A * B;

        System.out.printf("triangulo: %.3f%n circulo: %.3f%n trapezio: %.3f%n quadrado: %.3f%n retangulo: %.3f", triangulo, circulo, trapezio, quadrado, retangulo);
        scanner.close();
    }
}