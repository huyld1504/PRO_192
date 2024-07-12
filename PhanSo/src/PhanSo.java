
import java.util.Scanner;

public class PhanSo {
    private int tu;
    private int mau;
    
    //Constructor 
    public PhanSo (int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }
    
    public PhanSo (PhanSo A) {
        this.tu = A.tu;
        this.mau = A.mau;
    }
    
    public PhanSo () {
        this.tu = 1;
        this.mau = 2;
    }
    
    //Setter 
    public void setTu (int newTu) {
        this.tu = newTu;
    }
    
    public void setMau (int newMau) {
        if (newMau != 0) {
            this.mau = newMau;
        }
    }
    
    //Getter
    public int getTu () {
        return this.tu;
    }
    
    public int getMau () {
        return this.mau;
    }
    
    public void intput () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tu: ");
        tu = sc.nextInt();
        System.out.println("Enter mau: ");
        mau = sc.nextInt();
    }
    
    public void output (String str) {
        System.out.printf("%s fraction is: %d / %d \n", str, tu, mau);
    }
    
    public PhanSo sum (PhanSo P) {
        PhanSo T = new PhanSo();
        
        int a = tu*P.mau + mau*P.tu;
        int b = tu*mau;
        T.tu = a;
        T.mau = b;
        
        return T;
    }
    
    public PhanSo minus (PhanSo P) {
        PhanSo T = new PhanSo();
        
        int a = tu*P.mau - mau*P.tu;
        int b = tu*mau;
        T.tu = a;
        T.mau = b;
        
        return T;
    }
    
    public PhanSo multiple (PhanSo P) {
        PhanSo T = new PhanSo();
        
        int a = tu*P.tu;
        int b = mau*P.mau;
        T.tu = a;
        T.mau = b;
        
        return T;
    }
    
    public PhanSo divide (PhanSo P) {
        PhanSo T = new PhanSo();
        
        int a = tu*P.mau;
        int b = mau*P.tu;
        T.tu = a;
        T.mau = b;
        
        return T;
    }
}
