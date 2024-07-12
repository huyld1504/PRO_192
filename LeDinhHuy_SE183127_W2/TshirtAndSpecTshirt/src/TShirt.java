public class TShirt {

    private String style;
    private int size;

    public TShirt() {
        this.size = 0;
        this.style = "";
    }

    public TShirt (String style, int size) {
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
    
    public String toString () {
        String str = String.format(this.style + ", " + this.size);
        return str;
    }
}
