package org.example;

public class Venda {


    private double totalVendido;
    private RegraDePagamento pagamento;


    public double calcularTotal() {
        if (pagamento == null) {
            throw new IllegalStateException("Sem regra de pagamento");
        }
        return pagamento.pagar(this);
    }

    public double getTotalVendido() {
        return totalVendido;
    }

    public void setTotalVendido(double totalVendido) {
        this.totalVendido = totalVendido;
    }

    public void setPagamento(RegraDePagamento pagamento) {
        this.pagamento = pagamento;
    }
}
