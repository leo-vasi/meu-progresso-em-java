import java.util.Locale;
import java.util.Scanner;

public class aula06exer07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Média
        System.out.print("Digite o 1º valor: ");
        double valor1 = sc.nextDouble();

        System.out.print("Digite o 2º valor: ");
        double valor2 = sc.nextDouble();

        System.out.print("Digite o 3º valor: ");
        double valor3 = sc.nextDouble();

        double media = (valor1 + valor2 + valor3) / 3;
        if (valor1 >= valor2 && valor1 >= valor3) {
            System.out.print("O maior valor é: " + valor1);
            System.out.print("A média é: " + media);
        }
        else if (valor2 >= valor1 && valor2 >= valor3) {
            System.out.print("O maior valor é: " + valor2);
            System.out.print("A média é: " + media);
        }
        else if (valor3 >= valor1 && valor3 >= valor2) {
            System.out.print("O maior valor é: " + valor3);
            System.out.print("A média é: " + media);
        }
        else {
            System.out.print("Valor inválido.");
        }
        sc.close();
    }
}
