import java.util.Scanner;

public class Book {
    private String code;
    private String title;

    public Book(String code, String title) {
        this.code = code;
        this.title = title;
    }

    public Book() {
        this.code = "1000";
        this.title = "book";
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public void intput () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter code: ");
        this.code = sc.nextLine();
        System.out.print("Enter title: ");
        this.title = sc.nextLine();
    }
    
    public void output () {
        System.out.println("Code: " + this.code);
        System.out.println("Title: " + this.title);
    }
}
