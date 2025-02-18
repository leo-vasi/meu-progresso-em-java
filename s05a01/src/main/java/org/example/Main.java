package org.example;

import org.example.entities.Diretor;
import org.example.entities.Funcionario;
import org.example.entities.Gerente;

public class Main {
    public static void main(String[] args) {


        Funcionario funcionario = new Funcionario();
        Funcionario gerente = new Gerente();
        Funcionario diretor = new Diretor();


        Funcionario[] vetorFuncionarios = new Funcionario[3];

        vetorFuncionarios[0] = funcionario;
        vetorFuncionarios[1] = gerente;
        vetorFuncionarios[2] = diretor;

        for (Funcionario func : vetorFuncionarios) {
            func.setSalario(1000);

            System.out.println(func.calcularBonificacao());
        }
    }
}