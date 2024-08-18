import java.util.Scanner;

public class aula07exer04 {
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculando a conta final do hóspede");
        System.out.print("Digite aqui o seu nome: ");
        String nomeHospede = scanner.nextLine();

        System.out.print("Digite aqui o tipo de apartamento escolhido (entre A, B, C e D): ");
        String tipoApt = scanner.nextLine().toLowerCase();

        if (!tipoApt.equals("a") && !tipoApt.equals("b") && !tipoApt.equals("c") && !tipoApt.equals("d")) {
            System.out.println("Erro, digite uma opção válida!");
            return;
        }

        System.out.print("Digite aqui quantas diárias foram feitas: ");
        int quantidadeDiaria = lerInteiro(scanner);

        if (quantidadeDiaria < 0 || quantidadeDiaria >= 25) {
            System.out.println("Digite uma quantia válida!");
            return;
        }

        System.out.print("Digite aqui o valor do seu consumo interno: ");
        double consumoInterno = lerDouble(scanner);

        if (consumoInterno < 0) {
            System.out.println("Erro, digite uma quantia válida!");
            return;
        }

        double valorDiaria = calcularValorDiaria(tipoApt);
        double valorTotalDiarias = quantidadeDiaria * valorDiaria;
        double subtotal = valorTotalDiarias + consumoInterno;
        double taxa = subtotal * 0.10;
        double contaFinal = subtotal + taxa;

        System.out.printf("\n\n\tConta Final \n\nNome do hóspede: %s \n\nTipo de apartamento: %s "
                        + "\n\nQuantidade de diárias feitas: %d \n\nValor das diárias: %.2f R$"
                        + "\n\nValor do consumo interno: %.2f R$ \n\nSubtotal: %.2f R$"
                        + "\n\nTaxa de 10%% do subtotal: %.2f R$ \n\nValor total: %.2f R$\n",
                nomeHospede, tipoApt.toUpperCase(), quantidadeDiaria, valorDiaria,
                consumoInterno, subtotal, taxa, contaFinal);

        scanner.close();
    }

    public static double calcularValorDiaria(String tipoApt) {
        switch (tipoApt) {
            case "a":
                return 150.00;
            case "b":
                return 100.00;
            case "c":
                return 75.00;
            case "d":
                return 50.00;
            default:
                return 0.00;
        }
    }

    public static int lerInteiro(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Digite um número inteiro: ");
            }
        }
    }

    public static double lerDouble(Scanner scanner) {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Digite um número decimal: ");
            }
        }
    }
}
