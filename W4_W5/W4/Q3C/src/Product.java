/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public abstract class Product {
    private String name, brand;

    public Product(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public Product() {
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public abstract double infoSale();
    public abstract double totalAmount(int quantity);
}
