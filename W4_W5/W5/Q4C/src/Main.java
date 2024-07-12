
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
        System.out.print("Enter ID: ");
        String id = sc.nextLine();
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        System.out.println("OUTPUT:");
        Item item = new Item(id, name, size);
        System.out.println("After formating te size: " + item.formatSize());
        System.out.println("After formating the name: " + item.formatName());
    }
}
