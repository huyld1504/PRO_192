
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
public class tester {
    public static void main(String[] args) {
        int a, b;
        Scanner intput = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = intput.nextInt();
        System.out.println("Enter b: ");
        b = intput.nextInt();
        System.out.println("a + b = " + (a + b));
    }
}
