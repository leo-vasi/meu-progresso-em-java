package org.example;

import java.io.IOException;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> pilha = new Stack<>();
        Stack<Integer> minPilha = new Stack<>();

        for (int i = 0; i < N; i++) {
            String[] linha = br.readLine().split(" ");

            if (linha[0].equals("PUSH")) {
                int valor = Integer.parseInt(linha[1]);
                pilha.push(valor);
                if (minPilha.isEmpty() || valor <= minPilha.peek()) {
                    minPilha.push(valor);
                } else {
                    minPilha.push(minPilha.peek());
                }

            } else if (linha[0].equals("POP")) {
                if (pilha.isEmpty()) {
                    sb.append("EMPTY\n");
                } else {
                    pilha.pop();
                    minPilha.pop();
                }

            } else if (linha[0].equals("MIN")) {
                if (pilha.isEmpty()) {
                    sb.append("EMPTY\n");
                } else {
                    sb.append(minPilha.peek()).append("\n");
                }
            }
        }

        System.out.print(sb);
    }
}