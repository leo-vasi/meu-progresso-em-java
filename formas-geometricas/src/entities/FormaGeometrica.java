package entities;

abstract class FormaGeometrica {
    //Atributos genéricos
    protected String nome;
    protected String tipoCalculo;

    //Construtor genérico
    public FormaGeometrica(String nome, String tipoCalculo) {
        this.nome = nome;
        this.tipoCalculo = tipoCalculo;
    }
    //Getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipoCalculo() {
        return tipoCalculo;
    }
    public void setTipoCalculo(String tipoCalculo) {
        this.tipoCalculo = tipoCalculo;
    }
    //Método de cálculo genérico
    public abstract double calcular();
}
