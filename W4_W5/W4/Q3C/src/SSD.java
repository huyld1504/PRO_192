/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class SSD extends Product{
    private int speedread, capacity, price;
    private String code;    

    public SSD(int speedread, int capacity, int price, String code, String name, String brand) {
        super(name, brand);
        this.speedread = speedread;
        this.capacity = capacity;
        this.price = price;
        this.code = code;
    }

    public SSD(int speedread, int capacity, int price, String code) {
        this.speedread = speedread;
        this.capacity = capacity;
        this.price = price;
        this.code = code;
    }
    
    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return (this.code + "-" + this.getName() + "-" + this.getBrand() + "-" + this.capacity + "GB-" + this.speedread + "Bytes-" + this.price + "$");
    }

    @Override
    public double infoSale() {
        if (this.speedread <= 1024) return this.price * 0.8;
        else if (this.speedread > 1024 && this.capacity <= 2048) return this.price * 0.9;
        else return this.price * 0.95;
    }

    @Override
    public double totalAmount(int quantity) {
        double totalAmount = infoSale() * quantity;
        
        return totalAmount;
    }
    
    
    
}
