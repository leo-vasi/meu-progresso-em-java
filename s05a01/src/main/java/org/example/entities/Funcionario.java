package org.example.entities;

public class Funcionario {

    private String nome;
    private String cpf;
    private Double salario;


    public Funcionario(String nome, String cpf, Double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getSalario() {
        return salario;
    }

    public double calcularBonificacao() {
        return this.salario * 0.05;
    }
}
