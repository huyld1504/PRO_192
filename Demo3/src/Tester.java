
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
public class Tester {
    public static void main(String[] args) {
        String a = "em yeu co";
        String b = new String("em yeu co");
        
        if (a == b) 
            System.out.println("chung no giong nhau");
        else 
            System.out.println("chung ta k thuoc ve nhau");

        //So sánh nội dung chuỗi a và b 
        if (a.equals(b)) {
            System.out.println("chung no giong nhau");
        } else {
            System.out.println("chung ta k thuoc ve nhau");
        }
        
        String c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        c = sc.nextLine();
        //Check c is "SE......." or not
        
        if (c.matches("^[S][E]([0-9]){6}$")) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
