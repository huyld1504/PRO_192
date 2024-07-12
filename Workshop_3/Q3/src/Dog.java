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

    public Dog(String name) {
        super(name);
    }

    public Dog() {
    }

    @Override
    public void greets() {
        System.out.println(this.getName() + "Woow");
    }
    
    public void greets (int count) {
        do {
            System.out.print("Wooooow ");
            count--;
        } while (count < 0);
        System.out.println("");
    }

    @Override
    public String formatName() {
        String formatName = this.getName().replace(" ", "_");       
        
        return ("[" + formatName.toString().trim() + "]");
    }
    
}
