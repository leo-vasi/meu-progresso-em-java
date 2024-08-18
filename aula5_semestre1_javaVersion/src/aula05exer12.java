import java.util.Locale;
import java.util.Scanner;

public class aula05exer12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Calculando média de notas de um aluno ponderadas
        System.out.print("Digite aqui a 1º nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite aqui a 2º nota: ");
        double nota2 = sc.nextDouble();
        
        System.out.print("Digite aqui a 3º nota: ");
        double nota3 = sc.nextDouble();

        double somaNotas = (nota1 * 3) + (nota2 * 2) + (nota3 * 5);
        double media = somaNotas / 10;

        System.out.printf("A média é: %.2f", media);


        sc.close();
    }
}
