import java.util.Scanner;
public class exer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite aqui o número X: ");
        int numX = scanner.nextInt();
        System.out.print("Digite aqui o número Y: ");
        int numY = scanner.nextInt();
        int soma = numX + numY;
        System.err.println("A soma dos valores de X e Y é: " + soma);
        scanner.close();

    }

}
