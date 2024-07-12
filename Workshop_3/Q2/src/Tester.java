
import java.util.Scanner;


public class Tester {

    public static void main(String[] args) {
        int choice;
        String str = null;
        Scanner sc = new Scanner(System.in);
        StringProcessor stringProcessor = new StringProcessor();
        
        do {            
            System.out.println("1. Test match_pattern()");
            System.out.println("2. Test format_camel()");
            System.out.println("3. Exit the program");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter a student id: ");
                    str = sc.nextLine();
                    System.out.println("OUTPUT:");
                    System.out.println(stringProcessor.match_student_id(str) ? "True" : "False");
                    break;
                case 2:
                    System.out.print("Enter the string: ");
                    str = sc.nextLine();
                    System.out.println(stringProcessor.format_camel(str));
                    break;
            }
            
        } while (choice <= 2);
    }
}
