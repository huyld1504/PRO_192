
import java.util.Date;

public class Order {
    private long id;
    private String customer;
    private Date orderDate;
    private Drink drink;
    private int quantity;

    public Order() {
        this.id = 0;
        this.customer = "";
        this.orderDate = new Date();
        drink = new Drink();
        quantity = 0;
    }

    public Order(long id, String customer, Date orderDate, Drink drink, int quantity) {
        this.id = id;
        this.customer = customer;
        this.orderDate = orderDate;
        this.drink = drink;
        this.quantity = quantity;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public void printOrder () {
        System.out.println("Your Order");
        System.out.println("ID: " + this.id);
        System.out.println("Order date: " + this.orderDate.toString());
        System.out.println("Customer: " + this.customer);
        System.out.println("----------------------------------------------------------------");
        System.out.println("No   Drink's name   Price   Quantity   Total");
        System.out.println("1   " + this.drink.getName() + "   " + this.drink.getPrice() + "   " + this.quantity + "   " + (this.drink.getPrice()*this.quantity));
        System.out.println("----------------------------------------------------------------");
        System.out.println("Thank you");
    }
    
    
}
