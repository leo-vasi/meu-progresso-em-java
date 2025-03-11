package org.example;

public class PagamentoAVista implements RegraDePagamento {


    @Override
    public double pagar(Venda venda) {
        double total = venda.getTotalVendido();
        if (total > 500) {
            return total * 0.85; // 15% de desconto
        } else if (total > 300) {
            return total * 0.90; // 10% de desconto
        }
        return total; // Sem desconto para valores menores ou iguais a 300
    }
}