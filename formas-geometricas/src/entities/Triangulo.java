package entities;

public class Triangulo extends FormaGeometrica {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        super("Triângulo", "Área/Perímetro");
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public double getLadoA() {
        return ladoA;
    }
    public double getLadoB() {
        return ladoB;
    }
    public double getLadoC() {
        return ladoC;
    }

    public double calcularArea() {
        double s = (ladoA + ladoB + ladoC) / 2;
        return Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
    }

    public double CalcularPerimetro() {
        return ladoA + ladoB + ladoC;

        // vc tem que consertar essa classe triangulo 
        //esses métodos de calcular area e perimetro estão estranhos
    }

}
