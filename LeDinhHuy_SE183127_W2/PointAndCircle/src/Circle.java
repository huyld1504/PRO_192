public class Circle {

    private Point middle;
    private double radius;

    public Circle() {
        this.middle = null;
        this.radius = 0;
    }

    public Circle(double radius, Point middle) {
        this.middle = middle;
        this.radius = radius;
    }

    public Point getMiddle() {
        return middle;
    }

    public void setMiddle(Point middle) {
        this.middle = middle;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void displayRealtionship(Circle C2) {
        double d;

        d = Math.sqrt(Math.pow(this.getMiddle().getX() - C2.getMiddle().getX(), 2) + Math.pow(this.getMiddle().getY() - C2.getMiddle().getY(), 2));
        
        if (d == 0) 
            System.out.println("the same middle");
        else if (d > this.getRadius() + C2.getRadius()) 
            System.out.println("co le ben nhau la sai");
    }

    public void output() {
        System.out.printf("The cirle has the middle (%f; %f) and radius %f", this.middle.getX(), this.middle.getY(), this.radius);
    }

}
