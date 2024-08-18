package application;
import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;
public class Main {
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    System.out.println("1. Dólar Americano (USD)");
    System.out.println("2. Euro (EUR)");
    System.out.println("3. Libra Esterlina (GBP)");
    System.out.println("4. Yen Japonês (JPY)");
    System.out.println("5. Dólar Canadense (CAD)");
    System.out.println("6. Peso Argentino (ARS)");
    
    System.out.print("Escolha uma opção (1-6): ");
    int opcao = sc.nextInt();

    double cotacao = 0;
    String moeda = "";

    switch (opcao) {
        case 1:
            moeda = "USD";
            System.out.print("Digite aqui a cotação do Dólar Americano: ");
            cotacao = sc.nextDouble();
            break;
        case 2:
            moeda = "EUR";
            System.out.print("Digite aqui a cotação do Euro: ");
            cotacao = sc.nextDouble();
        case 3:
            moeda = "GBP";
            System.out.print("Digite aqui a cotação da Libra: ");
            cotacao = sc.nextDouble();
        case 4:
            moeda = "JPY";
            System.out.print("Digite aqui a cotação em Yen: ");
            cotacao = sc.nextDouble();
        case 5:
            moeda = "CAD";
            System.out.print("Digite aqui a cotação do Dólar Canadense: ");
            cotacao = sc.nextDouble();
        case 6:
            moeda = "ARS";
            System.out.print("Digite aqui a cotação do Peso Argentino: ");
            cotacao = sc.nextDouble();
        default:
            System.out.println("Opção inválida, selecione uma opção correta");
            break;
    }
    System.out.println("Quantas " + moeda + " serão compradas?");
    double quantidade = sc.nextDouble();

    double valorEmReais = CurrencyConverter.converterParaReais(cotacao, quantidade, moeda);

    System.out.printf("O valor a ser pago em reais será: %.2f", valorEmReais);
    sc.close();
    }
}
