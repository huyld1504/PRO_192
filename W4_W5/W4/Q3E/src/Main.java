
import java.util.ArrayList;
import java.util.List;
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
        MyTShirt myTShirt = new MyTShirt();
        Scanner sc = new Scanner(System.in);

        int choice = 0;

        while (choice <= 3) {
            List<TShirt> listOfTShirt = new ArrayList<>();
            System.out.print("Add how many elements: ");
            int element = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < element; i++) {
                System.out.print("Enter style: ");
                String style = sc.nextLine();
                System.out.print("Enter size: ");
                int size = sc.nextInt();
                sc.nextLine();
                System.out.println(listOfTShirt.add(new TShirt(style, size)) ? "Success" : "Fail");;
            }
            System.out.println("1. Test f1()\n"
                    + "2. Test f2()\n"
                    + "3. Test f3()\n");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("The list before running f1():");
                    for (TShirt tShirt : listOfTShirt) {
                        System.out.print(tShirt);
                    }
                    System.out.println("\n");
                    System.out.println("OUTPUT:");
                    System.out.println(myTShirt.f1(listOfTShirt));;
                    break;
                case 2:
                    System.out.println("The list before running f2():");
                    for (TShirt tShirt : listOfTShirt) {
                        System.out.print(tShirt);
                    }
                    System.out.println("\n");
                    System.out.println("OUTPUT:");
                    myTShirt.f2(listOfTShirt);
                    break;
                case 3:
                    System.out.println("The list before running f3():");
                    for (TShirt tShirt : listOfTShirt) {
                        System.out.print(tShirt);
                    }
                    System.out.println("\n");
                    System.out.println("OUTPUT:");
                    myTShirt.f3(listOfTShirt);
                    break;
            }
        }
    }

}
