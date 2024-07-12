
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        Service[] services = new Service[3];
        services[0] = new Service(1, "Tắm cho thú cưng", 1000);
        services[1] = new Service(2, "Tỉa móng", 500);
        services[2] = new Service(3, "Tiêm phòng", 3000);

        Customer customer = null;
        Pet pet = null;
        do {
            System.out.println("1. Create your pet");
            System.out.println("2. Create your customer");
            System.out.println("3. Choose service you want to take care your pet");
            System.out.println("4. Print your evoice");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    pet = new Pet();
                    pet.intputPet();
                    if (customer != null) {
                        customer.setPet(pet);
                    }
                    break;
                case 2:                    
                    customer = new Customer();
                    customer.inputCustomer();
                    customer.setPet(pet);
                    break;
                case 3:
                    if (pet == null || customer == null) {
                        System.out.println("Please do the 1 or 2 option!!!");
                        break;
                    } else {
                        System.out.println("1. Tắm cho thú cưng");
                        System.out.println("2. Tỉa móng");
                        System.out.println("3. Tiêm phòng");
                        int serviceId = 0;
                        do {
                            if (serviceId > 3) {
                                System.out.println("Please enter your service ID!");
                            } else {
                                System.out.print("Enter service you want: ");
                                serviceId = sc.nextInt();
                            }

                        } while (serviceId > 3);

                        Service customerOption = null;
                        for (Service service : services) {
                            if (service.getId() == serviceId) {
                                customerOption = service;
                            }
                        }
                        pet.setService(customerOption);
                        break;
                    }

                case 4:
                    System.out.println("Your invoice");
                    customer.printInvoice();
                    break;
            }
        } while (choice <= 4);
    }
}
