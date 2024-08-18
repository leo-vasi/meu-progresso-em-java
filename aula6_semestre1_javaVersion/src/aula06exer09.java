import java.util.Locale;
import java.util.Scanner;

public class aula06exer09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Determinando o grau de obesidade de uma pessoa
        System.out.print("Digite aqui o seu peso: " );
        double peso = sc.nextDouble();
        if (peso <= 0.4 || peso > 300) {
            System.out.println("Peso inválido");
            sc.close();
            return;
        }
        System.out.print("Digite aqui a sua altura: ");
        double altura = sc.nextDouble();
        if (altura <= 0.4 || altura > 3) {
            System.out.println("Altura inválida");
            sc.close();
            return;
        }
        
        double imc = peso / (altura * altura);
        if (imc < 26) {
            System.out.println("Peso normal");
        } else if (imc < 30) {
            System.out.println("Acima do peso");
        } else {
            System.out.println("Obesidade mórbida");
        }
        
        sc.close();
    }
}
