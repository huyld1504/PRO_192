
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
        MotoList listOfMoto = new MotoList();
        Motorbike m1 = new Motorbike("51X1-12345", "Le Dinh Huy", "Honda", 5000);
        Motorbike m2 = new Motorbike("51P1-12345", "Nguyen Ho Nam", "Honda", 25000);
        Motorbike m3 = new Motorbike("51F1-12345", "Dinh Duc Manh", "Honda", 10000);
        Motorbike m4 = new Motorbike("51M1-12345", "Le Minh Nhat", "Honda", 100000);
        Motorbike m5 = new Motorbike("51Z1-12345", "Pham Dai Hai", "Honda", 3000);
        listOfMoto.put(m1.getLiencePlate(), m1);
        listOfMoto.put(m2.getLiencePlate(), m2);
        listOfMoto.put(m3.getLiencePlate(), m3);
        listOfMoto.put(m4.getLiencePlate(), m4);
        listOfMoto.put(m5.getLiencePlate(), m5);

        int choice = 0;
        Scanner sc = new Scanner(System.in);

        while (choice <= 2) {
            System.out.println("1- List all moto by district\n"
                    + "2- Total value of moto in list \n");
            System.out.print("Enter choice: "); 
            choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter code (F;M;P;X;Z): ");
                    String code = sc.nextLine().toLowerCase();
                    System.out.println("OUTPUT:");
                    switch (code) {
                        case "x":
                            System.out.println("Registration in Thu Duc:");
                            listOfMoto.listByDistrict(code);
                            break;
                        case "f":
                            System.out.println("Registration in district 3:");
                            listOfMoto.listByDistrict(code);
                            break;
                        case "p":
                            System.out.println("Registration in Tan Binh district:");
                            listOfMoto.listByDistrict(code);
                            break;
                        case "z":
                            System.out.println("Registration in Can Gio or Nha Be:");
                            listOfMoto.listByDistrict(code);
                            break;
                        case "m":
                            System.out.println("Registration in district 11:");
                            listOfMoto.listByDistrict(code);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("OUTPUT: \n" + listOfMoto.totalValue());
                    break;
            }
        }
    }
}
