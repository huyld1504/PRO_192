
import java.util.Scanner;

public class Pet {

    private long id;
    private String name;
    private Service service;

    public Pet() {
        this.id = 0;
        this.name = "";
        this.service = null;
    }

    public Pet(long id, String name, Service service) {
        this.id = id;
        this.name = name;
        this.service = service;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public void intputPet() {
        Scanner sc = new Scanner(System.in);
        
        this.id = System.currentTimeMillis();
        System.out.print("Enter your pet's name: ");
        this.name = sc.nextLine();
    }

}
