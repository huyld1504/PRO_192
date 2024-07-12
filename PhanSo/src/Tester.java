public class Tester {
    public static void main(String[] args) {
        PhanSo A = new PhanSo();
        PhanSo B = new PhanSo();
        //Input and output fraction:
        A.intput();
//        A.output("A");
        B.intput();
//        B.output("B");
        
        //Sum
        PhanSo C = A.sum(B);
        C.output("C");
        
        //Minus
        PhanSo D = new PhanSo();
        D = B.minus(A);
        D.output("D");
        
        //Multiple
        PhanSo E = new PhanSo();
        E = A.multiple(B);
        E.output("E");
        
        //Divide
        PhanSo F = new PhanSo();
        F = B.divide(A);
        F.output("F");
    }
}
