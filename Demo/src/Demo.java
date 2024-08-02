
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Demo {
public static boolean check(String s) {
          String pattern =("(.*)Tutorials(.*)");

          System.out.println( "Result:"  +   s.matches(pattern)    ) ;
    return false;

    }

    public static void main(String[] args) {

         Demo.check("Welcome to Tutorialspoint.com") ;

    }
}
