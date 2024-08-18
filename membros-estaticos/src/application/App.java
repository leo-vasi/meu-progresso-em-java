package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class App {
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    System.out.println("What is the dollar price? ");
    double cotacao = sc.nextDouble();

    System.out.println("How many dollar will be bought?");
    double quantidadeDollars = sc.nextDouble();

    double valorEmReais = CurrencyConverter.converterParaReais(cotacao, quantidadeDollars);

    System.out.printf("The amount to be paid in reais will be: %.2f", valorEmReais);
    
    sc.close();
    }
}