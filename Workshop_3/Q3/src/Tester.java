
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
        int choice;
        String dogName = null, catName = null;
        Animal pet = null;
        
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Test greets methods with Cat, Dog from Animal class");
            System.out.println("2. Test format name from Cat, Dog class");
            System.out.print("Enter TC (1 or 2): ");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice) {
                case 1:
                    System.out.print("Enter the cat name: ");
                    catName = sc.nextLine();
                    System.out.print("Enter the dog name: ");
                    dogName = sc.nextLine();
                    System.out.println("OUTPUT");
                    pet = new Cat(catName);
                    pet.greets();
                    pet = new Dog(dogName);
                    pet.greets();
                    ((Dog)pet).greets(2);
                    break;
                case 2:
                    System.out.print("Enter the cat name: ");
                    catName = sc.nextLine();
                    System.out.print("Enter the dog name: ");
                    dogName = sc.nextLine();
                    System.out.println("OUTPUT");
                    pet = new Cat(catName);
                    System.out.println(pet.formatName());
                    pet = new Dog(dogName);
                    System.out.println(pet.formatName());
                    break;
            }
            
        } while (choice <= 2);
    }
}
