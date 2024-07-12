public class Triangle extends Shape{
    private double a, b, c;

    public Triangle() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    public boolean isValidData () {
        boolean result = false;
        
        if (this.a + this.b > this.c && this.a + this.c > this.b && this.b + this.c > this.a) {
            result = true;
        } else {
            result = false;
        }
        
        return result;
    }
    
    public double calPerimeter () {
        double p = (this.a + this.b + this.c) / 2;        
        return p;
    }
    
    public double calArea () {
        double p = (this.a + this.b + this.c) / 2; 
        double s = Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
        return s;
    }
}
