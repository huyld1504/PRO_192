
import java.util.Arrays;

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
        int[] arr = {1, 5, 7, 6, 10, 8, 9};     
        int brr[] = new int[]{1,2,3,4,5,6};        
        int a = 10;
        int [] crr = new int[arr.length];
        
        for (int i = 0; i < crr.length; i++) {
            crr[i] = arr[i] * a;
        }
        
        Arrays.sort(crr);
        System.out.println("After sorting: ");
        for (int i = 0; i < crr.length; i++) {
            System.out.println(crr[i]);
        }
    }
}
