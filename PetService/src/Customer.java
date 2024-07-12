
import java.util.Date;
import java.util.Scanner;

public class Customer {
    private long id;
    private String name;
    private String address;
    private Pet pet;
    
    public Customer () {
        this.id = 0;
        this.name = "";
        this.address = "";
        this.pet = null;
    }

    public Customer(long id, String name, String address, Pet pet) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.pet = pet;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
    
    public void inputCustomer () {
        Scanner sc = new Scanner(System.in);

        this.id = System.currentTimeMillis();
        System.out.print("Enter your name: ");
        this.name = sc.nextLine();
        System.out.print("Enter your address: ");
        this.address = sc.nextLine();
    }
    
    public void printInvoice () {
        Date date = new Date();
        System.out.println("|--------------------------------------------------------------------------|");
        System.out.println("|    YOUR INVOICE");
        System.out.println("|    Customer name: " + this.name + "     No." + this.id + "                        |");
        System.out.println("|    Address: " + this.address);
        System.out.println("|        -------------------------------------------------------           |");
        System.out.println("|    Invoice date: " + date.toString());
        System.out.println("|    Your pet's name: " + this.pet.getName() + "     No." + this.pet.getId() + "                        |");
        System.out.println("|        -----------------------------------------------------             |");
        System.out.println("|    Service you choose: " + this.pet.getService().getName() + "               |");
        System.out.println("|    Total price: " + this.pet.getService().getPrice() + "$" + "                                                 |");
        System.out.println("|        -----------------------------------------------------             |");
        System.out.println("                           Thank you!!                                     |");
        System.out.println("");
    }
}
