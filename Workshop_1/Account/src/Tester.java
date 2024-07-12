
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1. Show account information \n"
                + "2. Withdraw \n");

        int choiceSelect;
        System.out.print("Select a function from the menu: ");
        choiceSelect = sc.nextInt();

        String id = null, name = null;
        double balance;
        sc.nextLine();
        System.out.print("Enter id: ");
        id = sc.nextLine();

        System.out.print("Enter full name: ");
        name = sc.nextLine();

        System.out.print("Enter your balance: ");
        balance = sc.nextDouble();

        Account ac = new Account(id, name, balance);
        
        if (choiceSelect == 1) {
            System.out.println("OUTPUT: ");
            ac.showInfo();
        } else {
            double amount;
            System.out.print("Enter the amount you want to withdraw: ");
            amount = sc.nextDouble();
            System.out.println("OUTPUT: ");
            System.out.println(ac.withDraw(amount));
        }
    }
}
