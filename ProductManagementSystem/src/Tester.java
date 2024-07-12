
public class Tester {
    public static void main(String[] args) {
        Product product = new Product();      
        product.inputProduct();       
        product.outputProduct();        
        double finalPrice = product.getFinalPrice(0.7);        
        System.out.println("Final price: " + finalPrice);
        
        int ma = 123;
        String ten = "bắp";
        double gia = 100.1;
        Product c = new Product(ma, ten, gia);
        c.outputProduct();
        //Yêu cầu: Sửa giác của sản phẩm c là 200
        c.setPrice(1000);
        //Yêu cầu: xuất tên và giá của sản phẩm, tên của sản phẩm ở dạng viết hoa
//        System.out.println(c.getNameByUppercase() + " - after set price - " + c.getPrice());
        System.out.format("%10s %10.2f \n", c.getNameByUppercase(), c.getPrice());
        
        
        Product d = new Product(c);  //clone object: create a new object from a current object.
        d.outputProduct();
        
        Product e = c;
        e.outputProduct();
    }
}
