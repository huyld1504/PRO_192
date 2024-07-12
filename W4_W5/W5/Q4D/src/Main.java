
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Asus
 */
public class Main {

    public static void main(String[] args) {
        BusMotor listOfMotor = new BusMotor();
        listOfMotor.add(new Motorbike("51P5-77156", "Huong", "Yamaha", 3700));
        listOfMotor.add(new Motorbike("51X5-77156", "Manh", "Honda", 4600));
        listOfMotor.add(new Motorbike("51X5-77156", "Phat", "Yamaha", 5000));
        listOfMotor.add(new Motorbike("51F5-77156", "Nam", "Yamaha", 2000));
        listOfMotor.add(new Motorbike("51M5-77156", "An", "Suzuki", 4500));
        listOfMotor.add(new Motorbike("51Z5-77156", "Quang", "Honda", 2400));
        listOfMotor.add(new Motorbike("51F5-77156", "Linh", "Yamaha", 3600));

        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice <= 3) {
            System.out.println("1- Filter by Brand\n"
                    + "2- Count by District code\n"
                    + "3- Sort by owner");
            System.out.print("Enter TC: ");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter brand: ");
                    String codeBrand = sc.nextLine();
                    List<Motorbike> result = listOfMotor.filterByBrand(codeBrand);
                    System.out.println("OUTPUT:");
                    for (Motorbike motorbike : result) {
                        System.out.println(motorbike);
                    }
                    break;
                case 2:
                    System.out.print("Enter your code: ");
                    String districtCode = sc.nextLine();
                    System.out.println("OUTPUT:");
                    System.out.println(listOfMotor.countByDistrictCode(districtCode));
                    break;
                case 3:
                    System.out.println("OUTPUT:");
                    listOfMotor.sortByOwner();                   
                    break;
            }
        }
    }
}
