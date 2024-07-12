
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
        ProductList listOfSSD = new ProductList();
        listOfSSD.addSSD(new SSD(2048, 512, 100, "S20", "SSD Gen 4", "Samsung"));
        listOfSSD.addSSD(new SSD(2048, 128, 200, "S19", "SSD Gen 4", "Samsung"));
        listOfSSD.addSSD(new SSD(1024, 256, 300, "P14", "SSD Gen 3", "Kingston"));
        int choice = 0;

        while (choice <= 3) {
            System.out.println("1. Show SSD product list\n"
                    + "2. Show discount information of product entered by user\n"
                    + "3. Show Total amount information \n");
            System.out.print("Select a function from the menu:");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("OUTPUT:");
                    listOfSSD.displayAll();
                    break;
                case 2:
                    System.out.print("Enter code: ");
                    String code01 = sc.nextLine();
                    System.out.println("OUTPUT:");
                    listOfSSD.displayDiscountInfor(code01);
                    break;
                case 3:
                    System.out.print("Enter code: ");
                    String code02 = sc.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantity = sc.nextInt();
                    System.out.println("OUTPUT:");
                    System.out.println(listOfSSD.getTotalAmountInfor(code02, quantity));
                    break;
            }
        }
    }
}
