/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class TShirt implements Comparable<TShirt>{
    String style;
    int size;

    public TShirt() {
    }

    public TShirt(String style, int size) {
        this.style = style;
        this.size = size;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    } 

    @Override
    public String toString() {
        return String.format("(%s, %d)", this.style, this.size);
    }

    @Override
    public int compareTo(TShirt o) {
        if (Character.compare(this.style.charAt(1), o.getStyle().charAt(1)) > 0) return 1;
        else if (Character.compare(this.style.charAt(1), o.getStyle().charAt(1)) < 0) return -1;
        else return 0;
    }
    
}
