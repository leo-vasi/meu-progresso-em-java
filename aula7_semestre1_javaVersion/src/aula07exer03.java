import java.util.Locale;
import java.util.Scanner;

public class aula07exer03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite aqui a operação desejada (+, -, *, /): ");
        String op = sc.nextLine();
        
        if (!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/")) {
            System.err.println("Erro, digite uma operação válida.");
        } else {
            System.out.print("Digite aqui o 1º digito: ");
            double digito1 = sc.nextDouble();
            System.out.print("Digite aqui o 2º digito: ");
            double digito2 = sc.nextDouble();
            
            double resultado = 0;
            boolean operacaoValida = true;
            
            switch (op) {
                case "+":
                    resultado = digito1 + digito2;
                    break;
                case "-":
                    resultado = digito1 - digito2;
                    break;
                case "*":
                    resultado = digito1 * digito2;
                    break;
                case "/":
                    if (digito2 == 0) {
                        System.err.println("Operação inválida: divisão por zero.");
                        operacaoValida = false;
                    } else {
                        resultado = digito1 / digito2;
                    }
                    break;
                default:
                    operacaoValida = false;
                    System.err.println("Erro, operação inválida.");
                    break;
            }
            
            if (operacaoValida) {
                System.out.printf("O resultado é: %.2f%n", resultado);
            }
        }
        
        sc.close();
    }
}
