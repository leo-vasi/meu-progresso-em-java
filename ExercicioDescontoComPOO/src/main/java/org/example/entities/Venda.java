package org.example.entities;

public class Venda {
    protected double valor;

    public Venda() {
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double calcularTotal(Promocao desconto) {
        if (desconto.estaAtiva()) {
            double valorDesconto = valor * desconto.getValorDesconto();
            return valor - valorDesconto;
        } else {
            return valor;
        }
    }
}
