package com.leo.application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of taxpayers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Taxpayer #" + i + " data:");
            System.out.print("Individual or Company? (i/c): ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Annual income: ");
            Double anualIncome = sc.nextDouble();

            if (type == 'i') {
                System.out.print("Health expenditures: ");
                Double healthExpen = sc.nextDouble();
                Individual a = new Individual(name, anualIncome, healthExpen);
                list.add(a);
            } else {
                System.out.print("Number of employees: ");
                Integer numberOfEmployees = sc.nextInt();
                Company b = new Company(name, anualIncome, numberOfEmployees);
                list.add(b);
            }
        }

        double sum = 0.0;
        System.out.println();
        System.out.println("TAXES PAID:");
        for (TaxPayer tp : list) {
            double tax = tp.tax();
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
            sum += tax;
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

        sc.close();
    }
}
