package org.example.entities;

public class Diretor extends Funcionario{

    private String unidade;

    public Diretor(String nome, String cpf, Double salario, String unidade) {
        super(nome, cpf, salario);
        this.unidade = unidade;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    @Override
    public double calcularBonificacao() {
        return super.getSalario() * 0.15;
    }
}
