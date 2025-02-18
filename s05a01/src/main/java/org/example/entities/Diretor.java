package org.example.entities;

public class Diretor extends Funcionario{

    private String unidade;

    public Diretor() {
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    @Override
    public double calcularBonificacao() {
        return super.getSalario() * 0.20;
    }
}
