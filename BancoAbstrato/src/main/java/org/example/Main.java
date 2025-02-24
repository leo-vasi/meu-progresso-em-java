package org.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Conta conta = new Conta(1234, 100.0);

        Saque saque = new Saque(conta);
        saque.setData(new Date());
        saque.setDescricao("Saque ATM");
        saque.setValor(50.0);


        Deposito deposito = new Deposito(conta);
        deposito.setData(new Date());
        deposito.setDescricao("Depósito");
        deposito.setValor(5000.0);

        Pagamento pagamento = new Pagamento(conta);
        pagamento.setData(new Date());
        pagamento.setDescricao("Pagamento de aluguel");
        pagamento.setValor(1200.0);

        conta.novaTransacao(saque);
        conta.novaTransacao(deposito);
        conta.novaTransacao(pagamento);
    }
}