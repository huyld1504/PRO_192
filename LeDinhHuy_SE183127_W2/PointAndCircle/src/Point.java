public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
 
    public double getDistance (Point B) {
        return Math.sqrt(Math.pow(this.x - B.x, 2) + Math.pow(this.y - B.y, 2));
    }
    
    public void output (String pointName) {
        System.out.printf("Point %s has x,y coordinate: (%f; %f) \n", pointName, this.x, this.y);
    }
}
