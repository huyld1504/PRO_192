
import java.util.Date;
import java.util.Scanner;


public class Tester {
    public static void main(String[] args) {
        int choice = 0;
        Order order = null;
        
        Drink[] menu = new Drink[5];
        menu[0] = new Drink(200, "Tra sua", 55);
        menu[1] = new Drink(201, "Tra dao", 50);
        menu[2] = new Drink(202, "Sua chua", 35);
        menu[3] = new Drink(203, "Cafe da", 25);
        menu[4] = new Drink(204, "Cafe sua", 45);
        
        do {
            System.out.println("1. Create order");
            System.out.println("2. Print order");
            System.out.println("3. Close program");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: 
                    long id = System.currentTimeMillis();
                    String customer = "Khach le";
                    Date orderDate = new Date();

                    for (Drink drink : menu) {
                        System.out.println(drink.toString());
                    }
                    
                    System.out.print("Enter code: ");
                    int code = sc.nextInt();
                    Drink result = null;
                    for (Drink drink : menu) {
                        if (drink.getCode() == code) {
                            result = drink;
                        }
                    }
                    
                    System.out.print("Enter quantity: ");
                    int quantity = sc.nextInt();
                    
                    if (result == null) {
                        System.out.println("Code is invalid");
                    } else {
                        order = new Order(id, customer, orderDate, result, quantity);
                        System.out.println("Order was created!");
                    }
                    
                    break;
                case 2:
                    if (order != null) {
                        order.printOrder();
                    } else {
                        System.out.println("Please create order again!");
                    }
                    break;
            }
        } while (choice <= 2);
    }
}
