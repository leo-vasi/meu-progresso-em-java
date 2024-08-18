import java.util.Locale;
import java.util.Scanner;

public class aula05exer06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Calculando a idade atual de uma pessoa e quantos anos ela terá em 2030
        System.out.print("Digite aqui em que ano você nasceu: ");
        int anoNascimento = sc.nextInt();

        System.out.print("Digite aqui em que ano estamos: ");
        int anoAtual = sc.nextInt();

        int idadeAtual = anoAtual - anoNascimento;
        int idade2030 = idadeAtual + (2030 - anoAtual);

        System.out.printf("Você tem: %d anos e em 2030 terá: %d", idadeAtual, idade2030);
        sc.close();
    }
}
