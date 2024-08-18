package aula9;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Aula9exer04{

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println("\n\tCódigo do Lanche\tEspecificação\t\tPreço Unitário(R$)");
        System.out.println("100\tCachorro quente\t\t2,50");
        System.out.println("101\tBauru simples\t\t2,00");
        System.out.println("102\tBauru c/ovo\t\t3,50");
        System.out.println("103\tHamburger\t\t5,10");
        System.out.println("104\tCheeseburger\t\t3,30");
        System.out.println("105\tRefrigerante\t\t2,00");

        Map<Integer, String> descricaoLanches = new HashMap<>();
        Map<Integer, Double> precoLanches = new HashMap<>();

        descricaoLanches.put(100, "Cachorro quente");
        precoLanches.put(100, 2.50);

        descricaoLanches.put(101, "Bauru simples");
        precoLanches.put(101, 2.00);

        descricaoLanches.put(102, "Bauru c/ovo");
        precoLanches.put(102, 3.50);

        descricaoLanches.put(103, "Hamburger");
        precoLanches.put(103, 5.10);

        descricaoLanches.put(104, "Cheeseburger");
        precoLanches.put(104, 3.30);

        descricaoLanches.put(105, "Refrigerante");
        precoLanches.put(105, 2.00);

        boolean continuar = true;
        double totalPedido = 0.0;

        while (continuar) {
            System.out.print("Digite o código do lanche (ou 0 para encerrar o pedido): ");
            int codigo = sc.nextInt();

            if (codigo == 0) {
                continuar = false;
            } else if (descricaoLanches.containsKey(codigo)) {
                System.out.print("Digite a quantidade desejada: ");
                int quantidade = sc.nextInt();

                if (quantidade > 0) {
                    double precoUnitario = precoLanches.get(codigo);
                    double valorItem = precoUnitario * quantidade;
                    totalPedido += valorItem;
                    System.out.printf("%d x %s: R$ %.2f%n", quantidade, descricaoLanches.get(codigo), valorItem);
                } else {
                    System.out.println("A quantidade deve ser maior que zero.");
                }
            } else {
                System.out.println("Código de lanche inválido. Por favor, insira um código válido.");
            }
        }

        System.out.printf("Total do pedido: R$ %.2f%n", totalPedido);
        sc.close();
    }
}
