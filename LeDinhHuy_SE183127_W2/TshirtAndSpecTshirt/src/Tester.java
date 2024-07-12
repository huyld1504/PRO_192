
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0, size, color;
        String style = null;
        TShirt tShirt = null;
        do {
            System.out.print("Enter style: ");
            style = sc.nextLine();
            System.out.print("Enter size: ");
            size = sc.nextInt();
            System.out.print("Enter color: ");
            color = sc.nextInt();

            System.out.println("1. Test toString()");
            System.out.println("2. Test setData()");
            System.out.println("3. Test getValue()");
            System.out.print("Enter TC (1, 2, 3): ");
            choice = sc.nextInt();
            System.out.println("OUTPUT: ");
            switch (choice) {
                case 1:
                    tShirt = new TShirt(style, size);
                    System.out.println(tShirt.toString());
                    tShirt = new SpecTShirt(style, size, color);
                    System.out.println(tShirt.toString()); 
                    sc.nextLine();
                    break;
                case 2:
                    tShirt = new SpecTShirt(style, size, color);
                    ((SpecTShirt) tShirt).setData();
                    sc.nextLine();
                    break;
                case 3:
                    tShirt = new SpecTShirt(style, size, color);                    
                    System.out.println(((SpecTShirt)tShirt).getValue());
                    sc.nextLine();
                    break;
            }
        } while (choice <= 3);
    }
}
