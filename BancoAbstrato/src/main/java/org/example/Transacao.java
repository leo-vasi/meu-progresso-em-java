package org.example;

import java.util.Date;

public abstract class Transacao {

    private Date data;
    private double valor;
    private String descricao;
    protected Conta conta;

    public Transacao(Conta conta) {
        this.conta = conta;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public abstract void registrarTransacao();

    @Override
    public String toString() {
        return "Transacao [data= " + data + ", valor= " + valor + ", descricao= " + descricao + "]";
    }
}