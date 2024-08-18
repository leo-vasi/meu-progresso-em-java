package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Enter student name: ");
        student.name = sc.nextLine();
        
        System.out.print("Enter grade 1 score: ");
        student.grade1 = sc.nextDouble();

        System.out.print("Enter grade 2 score: ");
        student.grade2 = sc.nextDouble();

        System.out.print("Enter grade 3 score: ");
        student.grade3 = sc.nextDouble();

        System.out.printf("Final grade: %.2f%n", student.finalGrade());

        if (student.finalGrade() < 60) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f% POINTS", student.missingPoints());
        }
        else {
            System.out.println("PASS");
        }

        sc.close();
    }
}
