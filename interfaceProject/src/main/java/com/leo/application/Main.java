package com.leo.application;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PayPalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter contract data: ");
        System.out.print("Enter contract number: ");
        int number = sc.nextInt();

        System.out.println("Enter date: (dd/MM/yyyy)");
        LocalDate date = LocalDate.parse(sc.next(), fmt);

        System.out.println("Enter contract value: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(date, number, totalValue);

        System.out.print("Enter the number of installments: ");
        int num_inst = sc.nextInt();

        ContractService contractService = new ContractService(new PayPalService());

        contractService.processContract(contract, num_inst);
        System.out.println("Installments: ");

        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }

        sc.close();
    }
}