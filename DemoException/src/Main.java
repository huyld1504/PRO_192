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
        Student s = new Student();
        s.input();
        System.out.println(s);
        s.readData("thoca.txt");
        Staff a = new Staff();
        a.intput();
    }
}
