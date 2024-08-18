package util;

public class CurrencyConverter {
    public static final double IOF = 0.06;
    public static double converterParaReais (double cotacao, double quantidade, String moeda) {
        return quantidade * cotacao * (1 + IOF);
    }
}
