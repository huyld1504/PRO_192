import java.util.Scanner;

public class DectectiveBook extends Book {
    private double price;
    private String yearOfPubication;

    public DectectiveBook() {        
        super();
        this.price = 1000;
        this.yearOfPubication = "2024";
    }

    public DectectiveBook(double price, String yearOfPubication, String code, String title) {
        super(code, title);
        this.price = price;
        this.yearOfPubication = yearOfPubication;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getYearOfPubication() {
        return yearOfPubication;
    }

    public void setYearOfPubication(String yearOfPubication) {
        this.yearOfPubication = yearOfPubication;
    }

    public void intputDectectiveBook () {
        intput();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price: ");
        this.price = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter year of publication: ");
        this.yearOfPubication = sc.nextLine();
    }
    
    public void outputDectectiveBook () {
        output();
        System.out.println("Price: " + this.price);
        System.out.println("Year of publication: " + this.yearOfPubication);
    }
}
