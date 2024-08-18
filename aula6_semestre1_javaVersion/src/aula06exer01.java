import java.util.Locale;
import java.util.Scanner;

public class aula06exer01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Calculando média do aluno
        System.out.print("Digite aqui a sua média: ");
        double media = sc.nextDouble();
        if (media > 10 || media < 0) {
            System.out.println("Erro, número inválido");
        }
        else if (media >= 5) {
            String situacao = "aprovado";
            System.out.println("A situação do aluno é: " + situacao);
        }
        else if (media <= 3 || media < 5) {
            String situacao = "Exame";
            System.out.println("A situação do aluno é: " + situacao);
        }
        else {
            String situacao = "Reprovado";
            System.out.println("A situação do aluno é: " + situacao);
        }
        sc.close();
    }
}
