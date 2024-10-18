package com.mycompany.exercicio.application;

import com.mycompany.exercicio.entities.Rent;
import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        Rent[] vect = new Rent[10];
        for (int i = 1; i <= n; i++) {
            System.out.println("Rent #" + i + ": ");
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Room: ");
            int roomNumb = sc.nextInt();
            vect[roomNumb] = new Rent(name, email);
        }
        System.out.println("Busy rooms: ");
        for(int i = 0; i < 10; i ++) {
            if(vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }
        sc.close();
    }
}
