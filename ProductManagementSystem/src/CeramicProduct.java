
import java.util.Scanner;

public class CeramicProduct extends Product{
    private String type;

    public CeramicProduct () {
        super();
        this.type = "external";
    }

    public CeramicProduct(String type ,int ma, String ten, double gia) {
        super(ma, ten, gia);
        this.type = type;
    }

    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public void inputCeramicProduct () {
        inputProduct();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter type: ");
        this.type = sc.nextLine();
    }
    
    public void outputCeramicProduct () {
        outputProduct();
        System.out.println("Type: " + this.type);
    }
    
    
}
