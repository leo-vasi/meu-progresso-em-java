package org.example;

import java.security.SecureRandom;

public class GeradorDeSenha {
    private static final String CHARS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+";
    private static final SecureRandom random = new SecureRandom();

    public static String gerarSenha(int tamanho) {
        StringBuilder senha = new StringBuilder(tamanho);
        int maxIndex = CHARS.length();

        for (int i = 0; i < tamanho; i++) {
            senha.append(CHARS.charAt(random.nextInt(maxIndex)));
        }

        return senha.toString();
    }

    public static void main(String[] args) {
        System.out.println("Senha gerada: " + gerarSenha(16));
    }
}
