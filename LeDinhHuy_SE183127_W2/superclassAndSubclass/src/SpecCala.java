
import java.util.Arrays;
import java.util.Scanner;

public class SpecCala extends Cala {
    private int color;

    public SpecCala() {
        super();
        this.color = 0;
    }
    
    public SpecCala (int color, String owner, int price) {
        super(owner, price);
        this.color = color;
    }
    
    public String toString () {
        return String.format(this.getOwner() + ", " + this.getPrice() + ", " + this.color);
    }
    
    public void setData () {
        String str = this.getOwner();
        
        if(str.length() > 3) {
            str = str.substring(0, 2) + "XX" + str.substring(3);
        }
        
        System.out.println(str + ", " + this.getPrice());
    }
    
    public int getValue () {
        int result;
        
        if (this.color % 2 == 1) {
            result = this.getPrice() + 7;
        } else {
            result = this.getPrice() + 3;
        }
        
        return result;
    }
    
}
