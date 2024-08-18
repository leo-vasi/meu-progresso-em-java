package aula9;

import java.util.Locale;
import java.util.Scanner;

public class Aula9exer01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos anos serão necessários para que a população do país A, ultrapasse ou\r\n"
				+ "iguale a população do país B");
		int anos = 0;
		
		double popA = 98000000;
		double ganhoA = 0.035;
		
		double popB = 200000000;
		double ganhoB = 0.015;
		
		while (popA < popB) {
			popA += popA * ganhoA;
			popB += popB * ganhoB;
			anos += 1;
		}
		System.out.printf("A população do país A ultrapassará a do país B em %d anos", anos);
		sc.close();

	}

}
