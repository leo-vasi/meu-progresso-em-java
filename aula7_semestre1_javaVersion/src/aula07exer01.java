import java.util.Locale;
import java.util.Scanner;
public class aula07exer01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Checando vogais ou consoantes
        System.out.print("Digite aqui uma letra: ");
        String letra = sc.nextLine();
        switch (letra) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("Vogal");
                break;
            default:
            if (letra.matches("[a - z]")) {
                System.out.print("consoante");
            } else {
                System.out.println("Entrada inválida");
            }
            break;
    }
        sc.close();
    }
}
