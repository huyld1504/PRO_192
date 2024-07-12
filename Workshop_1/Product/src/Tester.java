
import java.util.Scanner;


public class Tester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id, quantity, discount, choice;
        String name = null;
        double price;
        
        System.out.print("Enter id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter price: ");
        price = sc.nextDouble();
        System.out.print("Enter quantity: ");
        quantity = sc.nextInt();
        
        Product a = new Product(id, name, price, quantity, 0);
        
        System.out.print("1. Test subTotal \n" + "2. Test setDiscount \n");
        System.out.print("Enter TC (1 or 2): ");
        choice = sc.nextInt();
        
        if (choice == 1) {
            System.out.print("OUTPUT: \n" + a.subTotal() + "\n");
        } else {
            System.out.print("Enter discount (%): ");
            discount = sc.nextInt();
            a.setDiscount(discount);
            System.out.print("OUTPUT: \n" + a.subTotal() + "\n");
        }
    }
}
