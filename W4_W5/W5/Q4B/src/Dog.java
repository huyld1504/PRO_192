/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Dog extends Animal{

    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println(this.getName() + "Woow");
    }
    
    public void greets(int count) {
        for(int i = 1; i <= count; i++) {
            System.out.print("Woooooow ");
        }
        
        System.out.println();
    }

    @Override
    public String formatName() {
        String result = this.getName().trim().replaceAll(" ", "_").toLowerCase();
        return ("[" + result.toString().trim() + "]");
    }
    
}
