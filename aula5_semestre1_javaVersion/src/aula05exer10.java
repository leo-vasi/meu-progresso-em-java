import java.util.Locale;
import java.util.Scanner;

public class aula05exer10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Calculando um número positivo e maior que zero
        System.out.print("Digite aqui um número (precisa ser maior que zero): ");
        double numero = sc.nextDouble();
        if (numero > 0) {
            double quadrado = Math.pow(numero, 2);
            double raiz = Math.sqrt(numero);
            System.out.printf("o número: %.2f ao quadrado é: %.2f%nA raiz do número: %.2f é: %.2f", numero, quadrado, numero, raiz);
        }


        sc.close();

    }
}
