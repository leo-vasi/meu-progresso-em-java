package org.example;

public class PagamentoAPrazo implements RegraDePagamento {

    private int numeroDeParcelas;

    @Override
    public double pagar(Venda venda) {
        return venda.getTotalVendido() * 1.08;
    }

    public void setNumeroDeParcelas(int numeroDeParcelas) {
        this.numeroDeParcelas = numeroDeParcelas;
    }

    public void exibirParcelas(Venda venda) {
        double totalComJuros = pagar(venda);
        double valorParcela = totalComJuros / numeroDeParcelas;
        System.out.println("Valor de cada parcela: " + valorParcela);
    }
}
