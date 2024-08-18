import java.util.Locale;
import java.util.Scanner;

public class aula06exer04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Menu de opções da calculadora
        System.out.print("Digite aqui um operador: ");
        int operadores = sc.nextInt();

        System.out.print("Digite aqui o 1º número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite aqui o 2º número: ");
        double num2 = sc.nextDouble();
        if (operadores == 1) {
            double resultado = num1 + num2;
            System.out.print("O resultado é: " + resultado);
        }
        else if (operadores == 2) {
            double resultado = num1 * num2;
            System.out.print("O resultado é: " + resultado);
        }
        else if (operadores == 3) {
            double resultado = num1 - num2;
            System.out.print("O resultado é: " + resultado);
        }
        else if (operadores == 4 && num2 > 0) {
            double resultado = num1 / num2;
            System.out.print("O resultado é: " + resultado);
        }
        else {
            System.out.print("Número inválido, tente denovo.");
        }
        sc.close();
    }
}
