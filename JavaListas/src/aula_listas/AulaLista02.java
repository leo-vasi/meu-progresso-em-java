package aula_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AulaLista02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Intervalo de 8 a 13 ");
		
		List<Integer> numeros = new ArrayList<>();
		for (int i = 0; i <= 15; i++) {
			numeros.add(i);
		}
		List<Integer> intervalo2 = numeros.subList(8, 14);
		System.out.println(intervalo2);
		
		
		sc.close();

	}

}
