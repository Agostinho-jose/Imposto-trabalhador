package entities;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        String name = scan.nextLine();
        employee.name = name;

        System.out.print("Gross Salary: ");
        double salary = scan.nextDouble();
        employee.grossSalary = salary;

        System.out.print("Tax: ");
        double tax = scan.nextDouble();
        employee.tax = tax;

        System.out.println("Employee: " + employee);

     System.out.println("Which percentage to increase salary?");
     double percentage = scan.nextDouble();
     employee.increaseSalary(percentage);
     System.out.println(" ");
     System.out.println("Updated data: " + employee);
     
        scan.close();
    }
}
