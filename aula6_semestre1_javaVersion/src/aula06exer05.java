import java.util.Locale;
import java.util.Scanner;

public class aula06exer05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        //Calculando a conta final do hóspede
        System.out.print("Digite aqui seu nome: ");
        String nome = sc.nextLine();
        
        System.out.print("Digite aqui o tipo de apartamento escolhido(entre A, B, C e D ): ");
        String tipoApt = sc.nextLine().toLowerCase();

        System.out.print("Digite aqui quantas diárias foram feitas: ");
        int qtdDiarias = sc.nextInt();

        System.out.print("Digite aqui o valor do seu consumo interno: ");
        double consInterno = sc.nextDouble();
        
        double valorDiaria;
        switch (tipoApt) {
            case "a":
            valorDiaria = 150.00;
                break;
            case "b":
            valorDiaria = 100.00;
                break;
            case "c":
            valorDiaria = 75.00;
                break;
            case "d":
            valorDiaria = 50.00;
                break;
            default:
            System.out.println("Tipo de apartamento inválido");
            valorDiaria = 0.00;
                break;
        }
        double valorTotalDiarias = qtdDiarias * valorDiaria;
        double subtotal = valorTotalDiarias + consInterno;
        double taxa = subtotal * 0.10;
        double contaFinal = subtotal + taxa;
        System.out.printf("\n\n\tConta Final \n\nNome do hóspede: %s \n\nTipo de apartamento: %s \n\nQuantidade de diárias feitas: %d \n\nValor das diárias: %.2f \n\nValor do consumo interno: %.2f \n\nSubtotal: %.2f R$ \n\nTaxa de 10%% do subtotal: %.2f \n\nValor total: %.2f\n",
                nome, tipoApt.toUpperCase(), qtdDiarias, valorDiaria, consInterno, subtotal, taxa, contaFinal);
        
        
        sc.close();
    }
}
