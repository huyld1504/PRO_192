/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class SmartPhone extends Product{
    private int price, internal_memory;
    private float weight;

    public SmartPhone (String code, String name, int internal_memory, float weight, int price) {
        super(code, name);
        this.price = price;
        this.internal_memory = internal_memory;
        this.weight = weight;
    }
    
    public void showInfo () {
        String str = null;
        str = String.format(this.code + "-" + this.name + "-" + this.internal_memory + "GB-" + this.weight + "g-" + this.price + "$");
        System.out.println(str);
    }
    
    public double buyNow (int quantity) {
        String discount_product = new String("IPHONE 14 PROMAX");
        double total;
        if (this.name.equals(discount_product) && quantity >=5 ) {
            total = this.price * quantity * 0.8;
        } else {
            total = this.price * quantity;
        }
        
        return total;
    }
    
}
