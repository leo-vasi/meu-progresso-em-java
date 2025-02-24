package org.example;

public class Saque extends Transacao {
    public Saque(Conta conta) {
        super(conta);
    }

    @Override
    public void registrarTransacao() {
        if (conta.getSaldo() >= getValor()) {
            conta.atualizarSaldo(-getValor());
            System.out.println("\nSaque realizado em " + getData());
            System.out.println("Descrição: " + getDescricao());
            System.out.println("Valor: " + getValor());
        } else {
            System.out.println("\nSaldo insuficiente para saque.");
        }
    }
}

