import java.util.Scanner;

public class Product {
    //Declare field    
    protected int id;
    protected String name;
    protected double price;
    
    //Declare methods
    
    //Constructor: là một function để khởi tạo field của object sau khi new object ra.
    public Product () {
        id = 1234;                          
        name = "product";
        price = 10;
    }
    
    public Product (int ma, String ten, double gia) {
        id = ma;
        name = ten;
        price = gia;
    }
    
    public Product (Product P) {
        this.id = P.id;
        this.name = P.name;
        this.price = P.price;
    }
    /*
        Viết constructor truyền vào 2 input: id, name. 
        Dùng nó để gán 2 field: id, name, price để default 200
    */
    public Product (int id, String name) {
        this.id = id;
        this.name = name;
        this.price = 200;
    }
    
    
    
    //Setters: dùng để sửa giá trị của 1 field trong object
    public void setPrice (double newPrice) {
        if (newPrice > 0) {
            this.price = newPrice;
        }
    }
    
    public void setName (String newName) {
        if (newName != null && !newName.isEmpty()) {
            this.name = newName;
        }
    }
    
    public void setID (int newID) {
        if (newID > 0) {
            this.id = newID;
        }
    }
    
    //Getters
    public String getNameByUppercase () {
        return this.name.toUpperCase();
    }
    
    public double getPrice () {
        return this.price;
    }
    
    public int getID () {
        return this.id;
    }
     
    public void inputProduct () {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter price: ");
        price = sc.nextDouble();
    }
    
    public void outputProduct () {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
    
    public double getFinalPrice (double discount) {
        return price * (1 - discount);
    }
}

/*
    Encapsulation: tính đóng gói (khả năng che đậy thông tin của một object).
    Access modifier: như public private, các khả năng sử dụng thông tin của object.
    Nếu muốn sử dụng các thông tin của object nói trên, chỉ được sử dụng thông qua các setter getter methods
    this pointer: đại diện cho object đang chạy (present the current object)
*/
