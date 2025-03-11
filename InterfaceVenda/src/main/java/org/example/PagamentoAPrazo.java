package org.example;

public class PagamentoAPrazo implements RegraDePagamento {

    @Override
    public double pagar(Venda venda) {
        return venda.getTotalVendido() * 1.08; // Acréscimo de 8% de juros
    }
}
