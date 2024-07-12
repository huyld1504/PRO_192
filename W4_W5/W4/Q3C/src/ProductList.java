
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class ProductList extends ArrayList<Product>{
    public void displayAll() {
        for (Product p : this) {
            System.out.println(((SSD)p));
        }
    }
    
    private Product findProductByCode(String code) {
        Product result = null;
        
        for (Product p : this) {
            if (((SSD)p).getCode().equalsIgnoreCase(code)) 
                result = p;
        }
        
        return result;
    }
    
    public void displayDiscountInfor(String code) {
        Product p = findProductByCode(code);
        
        System.out.println(((SSD)p).infoSale());
    }
    
    public double getTotalAmountInfor(String code, int quantity) {
        Product p = findProductByCode(code);
        double total = ((SSD)p).totalAmount(quantity);
        
        return total;
    }

    public void addSSD(SSD ssd) {
        this.add(ssd);
    }
}
