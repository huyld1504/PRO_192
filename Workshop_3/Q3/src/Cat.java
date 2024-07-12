

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

    public Cat(String name) {
        super(name);
    }

    public Cat() {
    }

    @Override
    public void greets() {
        System.out.println(this.getName() + "Meow");
    }

    @Override
    public String formatName() {
        String[] splitStrings = this.getName().split("\\s+");

        StringBuilder formatName = new StringBuilder();

        for (String splitString : splitStrings) {
            formatName.append(Character.toUpperCase(splitString.charAt(0)))
                    .append(splitString.substring(1).toLowerCase())
                    .append(" ");
        }
        return ("[" + formatName.toString().trim() + "]");
    }

}
