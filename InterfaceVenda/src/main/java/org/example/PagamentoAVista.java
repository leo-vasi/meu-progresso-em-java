package org.example;

public class PagamentoAVista implements RegraDePagamento {


    @Override
    public double pagar(Venda venda) {
        double total = venda.getTotalVendido();
        if (total > 500) {
            return total * 0.85;
        } else if (total > 300) {
            return total * 0.90;
        }
        return total;
    }
}