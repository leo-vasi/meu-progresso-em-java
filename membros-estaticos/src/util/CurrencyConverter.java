package util;

public class CurrencyConverter {
    public static final double IOF = 0.06;
    
    public static double converterParaReais(double cotacao, double quantidadeDollars) {
        return quantidadeDollars * cotacao * (1 + IOF);
    }
}


