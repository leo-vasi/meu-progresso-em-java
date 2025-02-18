package org.example;

import org.example.entities.Promocao;
import org.example.entities.PromocaoLimiteData;
import org.example.entities.PromocaoLimiteQuantidade;
import org.example.entities.Venda;

public class Main {
    public static void main(String[] args) {

        Venda v = new Venda();

        Promocao desconto = new PromocaoLimiteData();

        Promocao descontoPorQuantiade = new PromocaoLimiteQuantidade();

        v.setValor(1000);
        System.out.println("Valor sem desconto: " + v.getValor());
        System.out.println("Valor com desconto: " + v.calcularTotal(desconto));
        System.out.println("Valor com desconto por quantiade: " + v.calcularTotal(descontoPorQuantiade));
    }
}