package org.example;

import org.example.entities.Diretor;
import org.example.entities.Funcionario;
import org.example.entities.Gerente;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Funcionario func = new Funcionario("João", "123.456.789-00", 500.0);
        Gerente gerente = new Gerente("Maria", "987.654.321-00", 700.0, "Financeiro");
        Diretor diretor = new Diretor("Carlos", "456.123.789-00", 1000.0, "Mogi das Cruzes");

        System.out.println("Bonificação do Funcionário: " + func.calcularBonificacao());
        System.out.println("Bonificação do Gerente: " + gerente.calcularBonificacao());
        System.out.println("Bonificação do Diretor: " + diretor.calcularBonificacao());


    }
}