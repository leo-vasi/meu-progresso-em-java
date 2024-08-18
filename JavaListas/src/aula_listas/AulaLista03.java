package aula_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AulaLista03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Exibindo números pares");
		
		List<Integer> numeros = new ArrayList<>();
		
		for (int i = 0; i <= 15; i++) {
			numeros.add(i);
		}
		List<Integer> intervalo3 = new ArrayList<>();
		
		for (int numero : numeros) {
			if (numero % 2 == 0) {
				intervalo3.add(numero);
			}
		}
		System.out.println(intervalo3);
		sc.close();
	}

}
