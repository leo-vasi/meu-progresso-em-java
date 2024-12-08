package com.leo.application;

import entities.Account;
import exceptions.ExceptionClass;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data: ");
        System.out.println("Number: ");
        int number = sc.nextInt();

        System.out.println("Holder name: ");
        sc.nextLine();
        String holderName = sc.nextLine();

        System.out.println("Initial balance: ");
        double initialBalance = sc.nextDouble();

        System.out.println("Withdraw limit:  ");
        double withdrawLimit = sc.nextDouble();

        Account acc = new Account(initialBalance, holderName, number, withdrawLimit);
        System.out.println();

        System.out.println("Inform the quantity to withdraw: ");
        double amount = sc.nextDouble();

        try {
            acc.withdraw(amount);
            System.out.printf("New balance: %.2f%n", acc.getBalance());
        }
        catch (ExceptionClass e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}