import java.util.Locale;
import java.util.Scanner;

public class aula06exer03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Checando classe eleitoral
        System.out.println("Digite aqui a sua idade: ");
        int idade = sc.nextInt();

        if (idade < 16) {
            System.out.println("Não-eleitor(menor de idade)");
        }
        else if (idade >= 18 && idade <= 65) {
            System.out.println("Eleitor obrigatório");
        }
        else {
            System.out.println("Eleitor facultativo");
        }

        sc.close();
    }
}
