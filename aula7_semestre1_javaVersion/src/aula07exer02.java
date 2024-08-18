import java.util.Locale;
import java.util.Scanner;

public class aula07exer02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Checando cargo correspondente de um funcionário
        System.out.print("Digite seu código: ");
        int codigo = sc.nextInt();

        if (codigo > 5 | codigo <= 0) {
            System.out.println("Erro, código inválido");
        }
        else {
            switch (codigo) {
                case 1:
                System.out.println("Seu cargo é escriturário");
                    break;
                case 2:
                System.out.println("Seu cargo é secretária");
                    break;
                case 3:
                System.out.println("Seu cargo é caixa");
                    break;
                case 4:
                System.out.println("Seu cargo é gerente");
                    break;
                case 5:
                System.out.println("Seu cargo é diretor");
                    break;
            
                default:
                    break;
            }
        }

        sc.close();
    }
}
