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
    

     public static void main(String[] args) throws Throwable {

        int ia[][] = { {1,2}, null };

        int ja[][] = ia.clone();

        System.out.print((ia == ja) + " ");

        System.out.println(ia[0] == ja[0] && ia[1] == ja[1]);

    }
}
