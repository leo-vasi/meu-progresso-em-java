package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Venda v = new Venda();
        v.setTotalVendido(350.0);

        // Teste com pagamento a vista
        RegraDePagamento pagamento = new PagamentoAVista();
        v.setPagamento(pagamento);
        System.out.println("Total a vista: " + v.calcularTotal()); // Saída 315.0

        // Teste como pagamento a prazo
        PagamentoAPrazo pagamentoAPrazo = new PagamentoAPrazo();
        v.setPagamento(pagamentoAPrazo);
        System.out.println("Total a prazo: " + v.calcularTotal()); // Saída 378.0

        System.out.print("Digite o número de parcelas: ");
        int numeroParcelas = sc.nextInt();
        pagamentoAPrazo.setNumeroDeParcelas(numeroParcelas);
        pagamentoAPrazo.exibirParcelas(v);

        sc.close();
    }
}
