
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Asus
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e = null;

        int choice = 0;
        while (choice <= 3) {
            System.out.print("1.Test constructor and toString()\n"
                    + "2.Test Setters and Getters\n"
                    + "3.Test raiseSalary() \n");

            System.out.print("Enter TC (1,2 or 3): ");
            choice = sc.nextInt();

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter first name: ");
            String firstName = sc.nextLine();
            System.out.print("Enter last name: ");
            String lastName = sc.nextLine();
            System.out.print("Enter salary: ");
            int salary = sc.nextInt();
            
            e = new Employee(id, salary, firstName, lastName);

            switch (choice) {
                case 1:
                    System.out.println("OUTPUT: \n" + e);
                    break;
                case 2:
                    System.out.println("ID: " + e.getID());
                    System.out.println("Last name: " + e.getLastName());
                    System.out.println("First name: " + e.getFirstName());
                    System.out.println("Salary: " + e.getSalary());
                    System.out.println("Annual salary: " + e.getAnnualSalary());
                    break;
                case 3:
                    System.out.print("Enter salary percent (unit: %): ");
                    int raisePercent = sc.nextInt();
                    e.setSalary(e.raiseSalary(raisePercent));
                    System.out.println(e);
                    break;
            }
        }
    }
}
