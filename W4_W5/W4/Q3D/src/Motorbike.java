/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Motorbike {
    private String liencePlate, owner, brand;
    private long value;

    public Motorbike(String liencePlate, String owner, String brand, long value) {
        this.liencePlate = liencePlate;
        this.owner = owner;
        this.brand = brand;
        this.value = value;
    }

    public Motorbike() {
    }

    public String getLiencePlate() {
        return liencePlate;
    }

    public void setLiencePlate(String liencePlate) {
        this.liencePlate = liencePlate;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %s", this.liencePlate, this.owner, this.value);
    }
}
