package Service;

import java.io.Serializable;
import java.util.Comparator;

public class Service implements Comparable<Service>, Serializable{

    private int id, price, quantity;
    private String name;

    public Service(int id, int price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public Service() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Service{" + "id = " + id + ", price = " + price + ", name = " + name + '}';
    }

    @Override
    public int compareTo(Service o) {
        if (this.quantity > o.getQuantity()) {
            return 1;
        } else if (this.quantity < o.getQuantity()) {
            return -1;
        } else {
            return 0;
        }
    }

    //Viết hàm này là do sắp xếp thêm dựa vào name
    public static Comparator<Service> tmp = new Comparator<Service>() {
        @Override
        public int compare(Service o1, Service o2) {
            if (o1.quantity < o2.getQuantity()) {
                return 1;
            } else if (o1.quantity > o2.getQuantity()) {
                return -1;
            } else {
                return 0;
            }
        }
    };
}
