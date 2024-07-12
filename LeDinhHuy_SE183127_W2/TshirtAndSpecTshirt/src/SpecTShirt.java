public class SpecTShirt extends TShirt{
    private int color;

    public SpecTShirt() {
        super();
        this.color = 0;
    }

    public SpecTShirt(String style, int size) {
        super(style, size);
    }
    
    public SpecTShirt (String style, int size, int color) {
        super(style, size);
        this.color = color;
    }
    
    public String toString () {
        String str;
        str = String.format(this.getStyle() + ", " + this.getSize() + ", " + this.color);
        
        return str;
    }
    
    public void setData () {
        String str = this.getStyle();
        str = str.substring(0, str.length() - 1) + "3XL";
        System.out.println(str + ", " + this.getSize());
    }
    
    public int getValue () {
        int size;
        
        if (this.color <= 5)
            size = this.getSize() + 3;
        else 
            size = this.getSize();
        
        return size;
    }
}
