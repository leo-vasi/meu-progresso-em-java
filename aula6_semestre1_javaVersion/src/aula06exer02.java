import java.util.Locale;
import java.util.Scanner;

public class aula06exer02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Código correspondete ao cargo
        System.out.print("Digite aqui o seu código: ");
        int codigo = sc.nextInt();
        if (codigo == 1) {
            System.err.println("Escriturário");
        }
        else if (codigo == 2) {
            System.out.println("Secretária");
        }
        else if (codigo == 3) {
            System.out.println("Caixa");
        }
        else if (codigo == 4) {
            System.out.println("Gerente");
        }
        else if (codigo == 5) {
            System.out.println("Diretor");
        }
        else {
            System.err.println("Código inválido, digite um número de 1 a 5 para saber o cargo correspondente ao código.");
        }
        sc.close();
    }
}
