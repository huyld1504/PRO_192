
import java.util.Scanner;

public class Tool {
    private String str;
    
    public void inputString () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        str = sc.nextLine();
    }
    
    public int parseStringToInteger () {
        int number = Integer.parseInt(str);
        return number;
    }
}
