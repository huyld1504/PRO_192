
import java.util.Scanner;

public class Point {
    public double x;
    public double y;
    
    //Constructor
    public Point () {
        this.x = 1;
        this.y = 1;
    }
    
    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Point (Point A) {
        this.x = A.x;
        this.y = A.y;
    }
    
    //Setter
    public void setX (double newX) {
        this.x = newX;
    }
    
    public void setY (double newY) {
        this.y = newY;
    }

    //Getter
    public double getX () {
        return this.x;
    }
    
    public double getY () {
        return this.y;
    }
    
    public void intput () {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter x-coordinate: ");
        x = sc.nextDouble();
        
        System.out.println("Enter y-coordinate: ");
        y = sc.nextDouble();
    }
    
    public void output (String str) {
        System.out.printf("x-coordinate of %s: %f \n", str, x);

        System.out.printf("x-coordinate of %s la: %f \n", str, y);
    }
    
    public double getDistance (double x1, double y1) {
        return Math.sqrt((x - x1)*(x - x1) + (y - y1)*(y - y1));
    }
    
    public double getDistance (Point P) {
        return Math.sqrt((x - P.x)*(x - P.x) + (y - P.y)*(y - P.y));
    }
}
