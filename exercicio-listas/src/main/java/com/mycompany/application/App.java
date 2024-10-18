package com.mycompany.application;

import com.mycompany.entities.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("How many employees will be registered? ");
        int n = sc.nextInt();
        
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i+1) + ": ");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            
            Employee emp = new Employee(id, name, salary);
            
            list.add(emp);
        }
        System.out.print("Enter the employee id that will have a salary increase: ");
        int idSalary = sc.nextInt();
        
        Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
        
        if (emp == null) {
            System.out.print("This id does not exist");
        }
        else {
            System.out.print("Enter the percentege: ");
            double percent = sc.nextDouble();
            emp.increaseSalary(percent);
        }
        System.out.println("List of employees:");
        for (Employee e : list) {
            System.out.println(e);
        }
        sc.close();
    }
    public static Integer position (List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i ++) {
            return i;
        }
        return null;
    }
    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x-> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
