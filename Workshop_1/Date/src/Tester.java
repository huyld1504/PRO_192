
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc;
        System.out.print("Enter TC (1 or 2): ");
        tc = sc.nextInt();

        if (tc == 1) {
            Date a = new Date();
            int day, month, year;

            System.out.println("OUTPUT:");
            System.out.print("Enter the day, month and year: ");
            day = sc.nextInt();
            month = sc.nextInt();
            year = sc.nextInt();

            a.setDate(day, month, year);
            System.out.println(a.toString());
        } else {
            Date b = new Date();
            int day, month, year;

            System.out.print("Enter the day value:");
            day = sc.nextInt();

            System.out.print("Enter the month value:");
            month = sc.nextInt();

            System.out.print("Enter the year value:");
            year = sc.nextInt();

            b.setDay(day);
            b.setYear(year);
            b.setMonth(month);

            System.out.println("OUTPUT:");

            System.out.println(b.getDay());
            System.out.println(b.getMonth());
            System.out.println(b.getYear());
        }
    }
}
