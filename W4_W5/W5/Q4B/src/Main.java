
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
        Animal a = null;
        int choice = 0;
        while (choice <= 2) {
            System.out.println("1.Test greets methods with Cat,Dog from Animal class\n"
                    + "2.Test format name from Cat,Dog class");
            System.out.print("Enter TC (1 or 2): ");
            choice = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the cat name: ");
            String catName = sc.nextLine();
            System.out.print("Enter the dog name: ");
            String dogName = sc.nextLine();
            System.out.println("OUTPUT:");
            
            switch (choice) {
                case 1:
                    a = new Cat(catName);
                    a.greets();
                    a = new Dog(dogName);
                    a.greets();
                    System.out.print("Enter count that the dog greets: ");
                    int count = sc.nextInt();
                    ((Dog)a).greets(count);
                    break;
                case 2:
                    a = new Cat(catName);
                    System.out.println(a.formatName());
                    a = new Dog(dogName);
                    System.out.println(a.formatName());;
                    break;
            }
        }
    }
}
