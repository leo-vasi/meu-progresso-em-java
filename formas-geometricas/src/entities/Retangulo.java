package entities;

public class Retangulo extends FormaGeometrica {
    private double lado;
    private double altura;

    public Retangulo(double lado, String tipoCalculo) {
        super("Retângulo", "Área/Perímetro/Diagonal");
        this.lado = lado;
    }
    public double calcular() {
        if (getTipoCalculo().equals("Área")) {
            return lado * lado;
        }
        else if (getTipoCalculo().equals("Perímetro")) {
            return 4 * lado;
        }
        else if (getTipoCalculo().equals("Diagonal")) {
            return Math.sqrt(Math.pow(lado, 2) + Math.pow(altura, 2));
        }
        else {
            throw new IllegalArgumentException("Tipo de cálculo inválido");
        }
    }
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
}
