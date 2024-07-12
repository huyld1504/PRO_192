
import java.util.Scanner;

public class FoodProduct  extends Product{
    private String date;
    private String expiredDate;

    public FoodProduct(int ma, String ten, double gia, String date, String expiredDate) {
        super(ma, ten, gia);
        this.date = date;
        this.expiredDate = expiredDate;
    }

    public FoodProduct() {
        super();
        this.date = "01/05/2024";
        this.expiredDate = "22/07/2024";
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(String expiredDate) {
        this.expiredDate = expiredDate;
    }
    
    public void inputFoodProduct () {
        inputProduct();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date: ");
        this.date = sc.nextLine();
        
        System.out.print("Enter expired date: ");
        this.expiredDate = sc.nextLine();
    }
    
    public void outputFoodProduct () {
        outputProduct();
        System.out.println("Date: " + this.date);
        System.out.println("Expired date: " + this.expiredDate);
    }
    
}
