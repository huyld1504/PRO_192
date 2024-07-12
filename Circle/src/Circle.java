import java.util.Scanner;

public class Circle {
    private double x;
    private double y;
    private double r;
    
    //Constructor
    public Circle () {
        this.x = 1;
        this.y = 1;
        this.r = 1;
    }
    
    public Circle (double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r= r;
    }
    
    public Circle (Circle C) {
        this.x = C.x;
        this.y = C.y;
        this.r = C.r;
    }
    
    //Setter
    public void setX (double newX) {
        this.x = newX;
    }
    
    public void setY (double newY) {
        this.y = newY;
    }
    
    public void setR (double newR) {
        if (newR > 0) {
            this.r = newR;
        }
    }
    
    //Getter
    public double getX () {
        return this.x;
    }
    
    public double getY () {
        return this.y;
    }
    
    public double getR () {
        return this.r;
    }
    
    
    public void intput () {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap x: ");
        x = sc.nextDouble();
        System.out.println("Nhap y: ");
        y = sc.nextDouble();
        System.out.println("Nhap ban kinh: ");
        r = sc.nextDouble();
    }
    
    public void output () {
        System.out.println("Hinh tron co toa do x: " + x);
        System.out.println("Hinh tron co toa do y: " + y);
        System.out.println("Hinh tron co ban kinh r: " + r);
    }
    
    public double getArea () {
        return r * r * 3.14;
    }
    
    public double getP () {
        return 2 * r * 3.14;
    }
}
