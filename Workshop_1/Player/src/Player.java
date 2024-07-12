
import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private String name;
    private int age;
    private String major;
    
    public Player () {
        this.name = "Nguyen Van A";
        this.age = 20;
        this.major = "student";
    }
    
    public Player (String name, int age, String major) {
        this.name = name;
        this.major = major;
        this.age = age;
    }
    
    public void intput () {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter name: ");
        this.name = sc.nextLine();
        
        System.out.println("Enter age: ");
        this.age = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter major: ");
        this.major = sc.nextLine();
    }
    
    public String toString () {
        String str;
        str = String.format("name: %s \n" + 
                            "age: %d \n" +
                            "major: %s \n", this.name, this.age, this.major
                            );
        
        return str;
    }
}
