public class Tester {
    public static void main(String[] args) {
        Point A = new Point();
        A.intput();
        A.output("A");
        
        Point B = new Point();
        B.intput();
        B.output("B");
        
        double d1 = A.getDistance(B.x, B.y);
        System.out.println("Distance from A to B" + d1);
        
        double d2 = A.getDistance(B);
        System.out.println("Distance from A to B: " + d2);
    }
}
