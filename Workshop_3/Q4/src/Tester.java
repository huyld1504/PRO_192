
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
public class Tester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("1. Run the program");
            System.out.println("2. Exit the program");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter the id: ");
                String id = sc.nextLine().toUpperCase();
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                System.out.print("Enter size: ");
                int size = sc.nextInt();
                Item item = new Item(id, name, size);
                System.out.println("OUTPUT: ");
                System.out.println("After formating size: " + item.formatSize());
                System.out.println("After formating name: " + item.formatName());
            }

        } while (choice == 1);
    }
}
