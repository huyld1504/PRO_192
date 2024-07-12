
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
        int choice, size;
        String style = null;
        Scanner sc = new Scanner(System.in);
        MyTShirt myTShirt = null;
        do {
            System.out.print("Add how many elements: ");
            int elements = sc.nextInt();

            TShirt[] t = new TShirt[elements];
            for (int i = 0; i < elements; i++) {
                System.out.println("T-shirt no." + i + 1);
                sc.nextLine();
                do {
                    System.out.print("Enter style: ");
                    style = sc.nextLine();
                    System.out.print("Enter size: ");
                    size = sc.nextInt();
                    System.out.print("\n");
                } while (style.equals(""));

                t[i] = new TShirt(style, size);
            }

            do {
                System.out.println("1. Test f1()");
                System.out.println("2. Test f2()");
                System.out.println("3.Test f3()");
                System.out.println("Press any button to close program (exclusive 1, 2, 3)");
                System.out.print("Enter TC: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        myTShirt = new MyTShirt();
                        System.out.println("OUTPUT: ");
                        System.out.println(myTShirt.f1(t));
                        break;
                    case 2:
                        myTShirt = new MyTShirt();
                        System.out.println("OUTPUT: ");
                        myTShirt.f2(t);
                        break;
                    case 3:
                        myTShirt = new MyTShirt();
                        System.out.println("OUTPUT: ");
                        myTShirt.f3(t);
                        break;
                }
            } while (choice <= 3);
        
        } while (choice <= 3);
    }
}
