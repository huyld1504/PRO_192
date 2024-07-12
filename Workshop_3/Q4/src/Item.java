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
        String formatSize = null;
        switch (this.id) {
            case "ZARA":
                if (this.size >= 0 && this.size <= 4) {
                    formatSize = "XS";
                } else if (this.size > 4 && this.size <= 6) {
                    formatSize = "S";
                } else {
                    formatSize = "L";
                }
                break;
            case "MANGO":
                if (this.size >= 0 && this.size <= 4) {
                    formatSize = "S";
                } else if (this.size > 4 && this.size <= 6) {
                    formatSize = "M";
                } else {
                    formatSize = "L";
                }
                break;
            default:
                formatSize = "L";
                break;
        }
        
        return formatSize.toString();
    }

    @Override
    public String formatName() {
        String[] splittedStrings = this.name.split("\\s+");
        
        StringBuilder formatName = new StringBuilder();
        
        for (int i = 0; i < splittedStrings.length; i++) {
            formatName.append(splittedStrings[i]).append(" ");
        }
        
        return ("[" + formatName.toString().trim() + "]");
    }
    
    
}
