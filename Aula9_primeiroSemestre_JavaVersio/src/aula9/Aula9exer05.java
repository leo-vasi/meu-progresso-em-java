package aula9;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Aula9exer05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Programa que receba os dados de 5 produtos");
		
		Map<String, Double> imposto = new HashMap<>();
        imposto.put("Ate100", 0.05);
        imposto.put("Maior100", 0.10);
        
        Map<Integer, Double> ptcp = new HashMap<>();
        ptcp.put(1, 50.00);
        ptcp.put(2, 35.00);
        ptcp.put(3, 24.00);
		
        Map<Integer, Double> ptcn = new HashMap<>();
        ptcn.put(1, 12.00);
        ptcn.put(2, 35.00);
        ptcn.put(3, 60.00);
        
        double tp = 0.0;
        
        for (int i = 1; i <= 5; i++) {
            System.out.printf("Produto %d:%n", i);
            
            System.out.print("Digite aqui o valor unitário: ");
            double vu = sc.nextDouble();
            
            System.out.print("Digite aqui o número correspondente do país de origem, '1', '2' ou '3': ");
            int o = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Digite aqui o tipo de transporte, 'A' para aéreo, 'T' para terrestre e 'F' para fluvial: ");
            char t = sc.nextLine().toUpperCase().charAt(0);
            
            System.out.print("Sua carga é perigosa? Se sim, digite 'S', caso não, digite 'N': ");
            char cp = sc.nextLine().toUpperCase().charAt(0);
            
            double calculo_imposto;
            if (vu <= 100) {
                calculo_imposto = vu * imposto.get("Ate100");
            } else {
                calculo_imposto = vu * imposto.get("Maior100");
            }
            double vt;
            
            if (cp == 'S') {
                vt = ptcp.get(o);
            } else {
                vt = ptcn.get(o);
            }
            double seguro;
            
            if (o == 2 || t == 'A') {
                seguro = vu / 2;
            } else {
                seguro = 0;
            }
            double vf = vu + calculo_imposto + vt + seguro;
            tp += vf;
            
            System.out.printf("Preço unitário: R$ %.2f%n", vu);
            System.out.printf("Imposto: R$ %.2f%n", calculo_imposto);
            System.out.printf("Valor de transporte: R$ %.2f%n", vt);
            System.out.printf("Seguro: R$ %.2f%n", seguro);
            System.out.printf("Preço final: R$ %.2f%n", vf);
            System.out.println();
        }
        System.out.printf("Valor total do pedido: R$ %.2f%n", tp);
		sc.close();

	}

}
