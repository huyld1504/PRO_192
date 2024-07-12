
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Cala result = null;
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.print("Enter owner: ");
            String owner = sc.nextLine();
            System.out.print("Enter price: ");
            int price = sc.nextInt();
            System.out.print("Enter color: ");
            int color = sc.nextInt();

            System.out.println("1. Test to toString()");
            System.out.println("2. Test setData()");
            System.out.println("3. Test getValue()");
            System.out.print("Enter TC (1, 2, 3): ");
            choice = sc.nextInt();

            System.out.println("OUTPUT: ");
//            result = new SpecCala(color, owner, price);
            switch (choice) {
                case 1:
                    result = new Cala(owner, price);
                    System.out.println(result.toString());
                    result = new SpecCala(color, owner, price);
                    System.out.println(result.toString());
                    sc.nextLine();
                    break;
                case 2:
                    result = new SpecCala(color, owner, price);
                    ((SpecCala) result).setData();
                    sc.nextLine();
                    break;
                case 3:
                    result = new SpecCala(color, owner, price);
                    System.out.println(((SpecCala) result).getValue());;
                    sc.nextLine();
                    break;
            }
        } while (choice < 4);
    }

}
