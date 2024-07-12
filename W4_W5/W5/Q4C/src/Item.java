/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Item implements IService{
    private String id, name;
    private int size;

    public Item(String id, String name, int size) {
        this.id = id;
        this.name = name;
        this.size = size;
    }

    @Override
    public String formatSize() {
        switch (this.id) {
            case "ZARA":
                if (this.size >= 0 && this.size <= 4) return "XS";
                else if (this.size > 4 && this.size <= 6) return "S";
                else return "L";
            case "MANGO":
                if (this.size >= 0 && this.size <= 4) return "S";
                else return "M";
            default: 
                return "L";
        }
    }

    @Override
    public String formatName() {
        String[] splitName = this.name.split("\\s+");
        StringBuilder result = new StringBuilder();
        
        for (String string : splitName) {
            result.append(string).append(" ");
        }
        
        return ("[" + result.toString().trim() + "]");
    }
    
    
}
