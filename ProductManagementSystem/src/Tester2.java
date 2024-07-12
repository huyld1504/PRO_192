
import java.util.Scanner;

public class Tester2 {

    public static void main(String[] args) {
        int choice = 1;
        Product product = null;
        do {
            System.out.println("0. Create food product");
            System.out.println("1. Create electric product");
            System.out.println("2. Create ceramic product");
            System.out.println("3. Display info");
            System.out.println("4. Exit the program");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 0: 
                    product = new FoodProduct();
                    ((FoodProduct)product).inputFoodProduct();
                    break;
                case 1: 
                    product = new ElectricProduct();
                    ((ElectricProduct)product).inputElectricProduct();
                    break;
                case 2: 
                    product = new CeramicProduct();
                    ((CeramicProduct)product).inputCeramicProduct();
                    break;
                case 3: 
                    if (product instanceof ElectricProduct) {
                        ((ElectricProduct) product).ouptutElectricProduct();
                    } else if (product instanceof CeramicProduct) {
                        ((CeramicProduct) product).outputCeramicProduct();
                    } else if (product instanceof FoodProduct) {
                        ((FoodProduct) product).outputFoodProduct();
                    } else {
                        product.outputProduct();
                    }
                    break;
                case 4: break;
            }
        } while (choice <= 3);
    }
}
