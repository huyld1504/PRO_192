public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private int discount;
    
    public Product () {
        this.id = 0;
        this.name = null;
        this.price = 0;
        this.quantity = 0;
        this.discount = 0;
    }
    
    public Product (int id, String name, double price, int quantity, int discount) {
        discount = 0;
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }
    
    public void setDiscount (int discount) {
        if (discount > 100) {
            System.out.println("The discount is not valid");
        } else {
            this.discount = discount;
        }
    }
    
    public double subTotal () {
        double subTotal;
        
        subTotal = (this.quantity * this.price * (100 - this.discount)) / 100;
        
        return subTotal;
    }
}
