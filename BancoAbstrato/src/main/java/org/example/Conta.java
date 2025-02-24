package org.example;

import java.util.ArrayList;

public class Conta {
    private long numero;
    private double saldo;
    private ArrayList<Transacao> transacoes;

    public Conta(long numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
        this.transacoes = new ArrayList<>();
        System.out.println("Conta: " + numero + ", saldo inicial R$ " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void atualizarSaldo(double valor) {
        this.saldo += valor;
    }

    public void novaTransacao(Transacao transacao) {
        transacoes.add(transacao);
        transacao.registrarTransacao();
        consultarExtrato();
    }

    public void consultarExtrato() {
        System.out.println("\nEXTRATO DA CONTA");
        if (transacoes.isEmpty()) {
            System.out.println("Nenhuma transação realizada.");
        } else {
            for (Transacao t : transacoes) {
                System.out.println(t);
            }
            System.out.println("Saldo atual: R$ " + saldo);
        }
    }
}
