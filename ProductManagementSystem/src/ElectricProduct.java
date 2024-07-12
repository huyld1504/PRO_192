
import java.util.Scanner;

public class ElectricProduct extends Product {
    private int guarntity;
    private int volt;
    private int power;
    
    public ElectricProduct () {
//        this.id = 1;
//        this.name = "đèn led";
//        this.price = 1;
        super();
        //Lớp con gọi cconstructor của lớp cha để khởi tạo các field của lớp cha
        this.guarntity = 1;
        this.power = 1;
        this.volt = 1;
    }
    
    public ElectricProduct (int id, String name, double price, int guarntity, int volt, int power) {
        super(id, name, price);
        this.guarntity = 1;
        this.power = 1;
        this.volt = 1;
    }

    public int getGuarntity() {
        return guarntity;
    }

    public int getVolt() {
        return volt;
    }

    public int getPower() {
        return power;
    }

    public void setGuarntity(int guarntity) {
        this.guarntity = guarntity;
    }

    public void setVolt(int volt) {
        this.volt = volt;
    }

    public void setPower(int power) {
        this.power = power;
    }
    
    public void inputElectricProduct () {
        inputProduct();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter guarntity: ");
        guarntity = sc.nextInt();
        System.out.print("Enter volt: ");
        volt = sc.nextInt();
        System.out.print("Enter power: ");
        power = sc.nextInt();
    }
    
    public void ouptutElectricProduct () {
        outputProduct();
        System.out.print("Guarantity: " + guarntity + " \n Volt: " + volt + " \n Power: " + power);
    }
}
