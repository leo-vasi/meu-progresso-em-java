package org.example.entities;

public class PromocaoLimiteQuantidade extends Promocao{

    protected int quantidadeLimite;
    protected int totalUsos;

    public PromocaoLimiteQuantidade() {
    }

    public int getQuantidadeLimite() {
        return quantidadeLimite;
    }

    public void setQuantidadeLimite(int quantidadeLimite) {
        this.quantidadeLimite = quantidadeLimite;
    }

    public int getTotalUsos() {
        return totalUsos;
    }

    public void setTotalUsos(int totalUsos) {
        this.totalUsos = totalUsos;
    }

    @Override
    public boolean estaAtiva() {
        return super.estaAtiva();
    }

    @Override
    public double getValorDesconto() {
        return super.getValorDesconto();
    }
}
