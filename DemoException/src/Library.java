
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
public class Library {
    public static int inputNumber(int min, int max) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n < min || n > max) throw new Exception();
        
        return n;
    }
}
