import java.util.Scanner;

public class exer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite aqui o valor de A: ");
        int a = scanner.nextInt();
        
        System.out.print("Digite aqui o valor de B: ");
        int b = scanner.nextInt();
        
        System.out.print("Digite aqui o valor de C: ");
        int c = scanner.nextInt();
        
        System.out.print("Digite aqui o valor de D: ");
        int d = scanner.nextInt();
        
        int diferenca = a * b - c * d;

        System.out.println("A diferença é: " + diferenca);
        
        scanner.close();
    }
}
