
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
        DoctorsMap m = new DoctorsMap();
        Doctor d = new Doctor(1, "A", 4000);
        Doctor d1 = new Doctor(2, "B", 3000);
        Doctor d3 = new Doctor(3, "C", 2000);
        
        m.put(d.getId(), d);
        m.put(d1.getId(), d1);
        m.put(d3.getId(), d3);
        
        //find doctor base on ID
        System.out.print("Enter ID");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        Doctor result = m.get(id);
        System.out.println(result != null ? result : "Not found");
        
        System.out.println("Doctors List: ");
        m.displayAll();
    }
}
