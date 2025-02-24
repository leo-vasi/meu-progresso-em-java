package org.example;

public class Pagamento extends Transacao {
    public Pagamento(Conta conta) {
        super(conta);
    }

    @Override
    public void registrarTransacao() {
        if (conta.getSaldo() >= getValor()) {
            conta.atualizarSaldo(-getValor()); // Reduz o saldo
            System.out.println("\nPagamento realizado em " + getData());
            System.out.println("Descrição: " + getDescricao());
            System.out.println("Valor: " + getValor());
        } else {
            System.out.println("\nSaldo insuficiente para pagamento.");
        }
    }
}

