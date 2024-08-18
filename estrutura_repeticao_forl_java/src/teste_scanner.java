import java.util.Scanner;

public class teste_scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        char sexo;
        int idade;
        double altura;
        double peso;
        String tipoSanguineo;
        boolean moraSP;
        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite aqui o seu sexo (M/F): ");
        sexo = sc.next().charAt(0);
        System.out.println("Digite a sua idade: ");
        idade = sc.nextInt();
        System.out.print("Digite sua altura (em metros): ");
        altura = sc.nextDouble();
        System.out.print("Digite seu peso (em kg): ");
        peso = sc.nextDouble();
        System.out.print("Digite seu tipo sanguíneo: ");
        tipoSanguineo = sc.next();
        System.out.print("Mora em São Paulo? (true/false): ");
        moraSP = sc.nextBoolean();

        System.out.println("\nInformações do Formulário:");
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura + " m");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Tipo Sanguíneo: " + tipoSanguineo);
        System.out.println("Mora em São Paulo: " + moraSP);
        
        sc.close();
    }
    
}
