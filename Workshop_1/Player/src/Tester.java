
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.print("Enter your choice (1-2): ");
        choice = sc.nextInt();

        if (choice == 1) {
            Player a = new Player();

            System.out.println("OUTPUT: ");
            System.out.println(a.toString());
        } else {
            int age;
            String name;
            String major;
            
            sc.nextLine();
            System.out.print("Enter name: ");
            name = sc.nextLine();

            System.out.print("Enter age: ");
            age = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter major: ");
            major = sc.nextLine();

            Player a = new Player(name, age, major);

            System.out.println("OUTPUT: ");
            System.out.println(a.toString());
        }
    }
}
