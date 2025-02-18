package org.example.entities;

public class Promocao {
    protected String nome;
    protected double valorDesconto;

    public Promocao() {
        this.valorDesconto = 0.05;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public boolean estaAtiva() {
        return true;
    }
}
