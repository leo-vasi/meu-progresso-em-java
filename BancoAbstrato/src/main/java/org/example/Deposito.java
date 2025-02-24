package org.example;

public class Deposito extends Transacao{

    public Deposito(Conta conta) {
        super(conta);
    }

    @Override
    public void registrarTransacao() {
        conta.atualizarSaldo(getValor());
        System.out.println("\nDepósito realizado em " + getData());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Valor: " + getValor());
    }
}
