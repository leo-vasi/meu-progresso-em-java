package entities;

public class Quadrado extends FormaGeometrica {
    private double lado;

    public Quadrado(double lado, String tipoCalculo) {
        super("Quadrado", "Área/Perímetro/Diagonal");
        this.lado = lado;
    }
    public double calcular() {
        if (getTipoCalculo().equals("Área")) {
            return lado * lado;
        }
        else if (getTipoCalculo().equals("Perímetro")) {
            return 4 * lado;
        }
        else if (getTipoCalculo().equals("Diagonal")){
            return lado * Math.sqrt(2); 
        }
        else {
            throw new IllegalArgumentException("Tipo de cálculo inválido");
        }
    }

    public double lado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
}
