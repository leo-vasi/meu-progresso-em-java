package org.example.entities;

public class Gerente extends Funcionario{

    private String setor;

    public Gerente(String nome, String cpf, Double salario, String setor) {
        super(nome, cpf, salario);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public double calcularBonificacao() {
        return super.getSalario() * 0.10;
    }
}
