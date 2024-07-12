
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
        int choice = 0;

        while (choice <= 2) {
            System.out.println("1.Test match_pattern().\n"
                    + "2.Test format_camel().");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter a string: ");
            String string = sc.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.println("OUTPUT:");
                    System.out.println(StringProcessor.match_student_id(string));;
                    break;
                case 2:
                    System.out.println("OUTPUT:");
                    System.out.println(StringProcessor.formatCamel(string));
                    break;
            }
        }
    }
}
