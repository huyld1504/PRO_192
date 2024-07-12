
public class Tester {

    public static void main(String[] args) {
        Point middle1 = new Point(2,3);
        Point middle2 = new Point(2,3);
        
        Circle c1 = new Circle(10.5, middle1);
        Circle c2 = new Circle(20.5, middle2);
        
        c1.displayRealtionship(c2);
    }
}
