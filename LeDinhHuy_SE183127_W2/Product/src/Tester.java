
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
        int choice = 0, price, internal_memory;
        float weight;
        String code = null, name = null;
        
        Product product = null;
        
        do {
            System.out.print("Enter code: ");
            code = sc.nextLine();
            System.out.print("Enter name: ");
            name = sc.nextLine();
            System.out.print("Enter internal memory: ");
            internal_memory = sc.nextInt();
            System.out.print("Enter weight: ");
            weight = sc.nextFloat();
            System.out.print("Enter price: ");
            price = sc.nextInt();
            
            System.out.println("1. Show product information");
            System.out.println("2. Enter quantity and see the total payment");
            System.out.print("Select a function from menu: ");
            choice = sc.nextInt();
            
            product = new SmartPhone(code, name, internal_memory, weight, price);
            switch (choice) {
                case 1:
                    System.out.println("OUTPUT: ");
                    ((SmartPhone)product).showInfo();
                    sc.nextLine();
                    break;
                case 2: 
                    int quantity;
                    System.out.print("Enter quantity: ");
                    quantity = sc.nextInt();
                    System.out.println("OUTPUT: ");
                    System.out.println(((SmartPhone)product).buyNow(quantity));
                    sc.nextLine();
                    break;
            }
        } while (choice <= 2);
        
    }
}
