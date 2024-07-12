
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        int option;
        Scanner sc = new Scanner(System.in);
        Book book = null;
        do {
            System.out.println("1. Create and display a Dectective Book");
            System.out.println("2. Create and display a Science Book");
            System.out.println("3. Close program");
            System.out.print("Enter option: ");
            option = sc.nextInt();
            
            switch (option) {
                case 1: 
                    book = new DectectiveBook();
                    ((DectectiveBook)book).intputDectectiveBook();
                    System.out.println("OUTPUT: ");
                    ((DectectiveBook)book).outputDectectiveBook();
                    break;
                case 2: 
                    book = new ScienceBook();
                    ((ScienceBook)book).inputScienceBook();
                    System.out.println("OUTPUT: ");
                    ((ScienceBook)book).outputScienceBook();
                    break;
            }
        } while (option <= 2);
    }

}
