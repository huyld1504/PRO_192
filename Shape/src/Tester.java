
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        int choice;
        Shape shape = null;

        do {
            System.out.print("Enter first edge: ");
            a = sc.nextDouble();
            System.out.print("Enter second edge: ");
            b = sc.nextDouble();
            System.out.print("Enter third edge: ");
            c = sc.nextDouble();

            shape = new Triangle(a, b, c);

            System.out.println("1. Test valid data");
            System.out.println("2. Test calArea()");
            System.out.println("3. Test calPerimeter()");
            System.out.print("Enter TC: ");
            choice = sc.nextInt();
            System.out.println("OUTPUT:");

            switch (choice) {
                case 1:
                    System.out.println(((Triangle) shape).isValidData() == true ? "Valid data" : "Invalid data");
                    break;
                case 2:
                    System.out.println(((Triangle) shape).calArea());
                    break;
                case 3:
                    System.out.println(((Triangle) shape).calPerimeter());
                    break;
            }
        } while (choice < 4);
    }
}
