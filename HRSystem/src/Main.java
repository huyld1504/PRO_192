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
        Staff s = new BA("y te", "1234", "123", "huy", 1000);
        s.doTask();
        System.out.println("income: " + s.getIncome());
        System.out.println("tax: " + s.getTax());
        
        //Case 1: prototype (ép kiểu class)
        //Case 2: 
        ITimeTracking t = (ITimeTracking) s;
        t.sendRequest();
        System.out.println("----------------------------");
        
        
        s = new Senior(12, "C#", "SE999", "999", "huy", 5000);
        s.doTask();
        System.out.println("income: " +  s.getIncome());
        System.out.println("tax: " + s.getTax());
        t = (ITimeTracking) s;
        t.sendRequest();
        ICode c = (ICode) s;
        c.pull();
        c.push();
    }
}
