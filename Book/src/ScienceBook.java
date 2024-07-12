import java.util.Scanner;

public class ScienceBook extends Book {
    private int type;

    public ScienceBook(int type, String code, String title) {
        super(code, title);
        this.type = type;
    }

    public ScienceBook() {
        super();
        this.type = 1;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    
    public void inputScienceBook () {
        intput();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Type 1: Physical \nType 2: Mathematic \nType 3: Chemistry");
        System.out.print("Enter type 1-3: ");
        this.type = sc.nextInt();
    }
    
    public void outputScienceBook () {
        output();
        switch (this.type) {
            case 1: 
                System.out.println("Type: Physical");
                break;
            case 2:
                System.out.println("Type: Mathematic");
                break;
            case 3: 
                System.out.println("Type: Chemistry");
        }
    }
    
    
}
