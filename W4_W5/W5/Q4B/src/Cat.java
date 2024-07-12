/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Cat extends Animal {

    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println(this.getName() + "Meow");
    }

    @Override
    public String formatName() {
        String[] splitString = this.getName().split("\\s+");
        
        StringBuilder str = new StringBuilder();

        for (String string : splitString) {
            str.append(Character.toUpperCase(string.charAt(0)))
                    .append(string.substring(1).toLowerCase())
                    .append(" ");
        }
        
        return ("[" + str.toString().trim() + "]");
    }
}
