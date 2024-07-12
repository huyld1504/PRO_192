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
        Circle a = new Circle();
        
        a.intput();
        
        a.output();
        
        double area = a.getArea();
        
        double p = a.getP();
        
        System.out.println("Dien tich hinh tron la: " + area);
        System.out.println("Chu vi hinh tron la: " + p);
    }
}
