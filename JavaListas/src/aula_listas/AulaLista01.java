package aula_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AulaLista01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Treino de listas em Java" + "Intervalo de 1 a 9");
		List<Integer> numeros = new ArrayList<>();
        for (int i = 0; i <= 15; i++) {
            numeros.add(i);
        }
        List<Integer> intervalo1 = numeros.subList(1, 10);
        System.out.println("A: " + intervalo1);
		
        sc.close();

	}

}
