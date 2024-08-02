
import Customer.Customer;
import Customer.CustomerSet;
import Order.Order;
import Order.OrderDetail;
import Pet.Pet;
import Service.ServiceList;
import Service.Service;
import java.util.ArrayList;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        ServiceList listOfServices = new ServiceList();
        String fileName = "data.txt";
//        listOfServices.loadData(fileName);
        listOfServices.loadBinaryFile("data.dat");
//        listOfServices.add(new Service(1, 500, "Massage"));
//        listOfServices.add(new Service(2, 300, "Tia mong"));
//        listOfServices.add(new Service(3, 700, "Tam cho thu cung"));
//        listOfServices.add(new Service(4, 200, "Tia long"));

        CustomerSet cusSet = new CustomerSet();
        do {
            System.out.println("1. Manage services");
            System.out.println("2. Manage customer and orders");
            System.out.println("3. Report");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int choice2;
                    do {
                        System.out.println("1. Add service");
                        System.out.println("2. Display service");
                        System.out.println("3. Update service");
                        System.out.println("4. Delete service");
                        System.out.println("5. Search service");
                        System.out.print("Enter choice: ");
                        choice2 = sc.nextInt();

                        switch (choice2) {
                            case 1:
                                int id,
                                 price;
                                String name = null;
                                System.out.print("Enter ID: ");
                                id = sc.nextInt();
                                sc.nextLine();
                                System.out.print("Enter name: ");
                                name = sc.nextLine();
                                System.out.print("Enter price: ");
                                price = sc.nextInt();
                                Service s = new Service(id, price, name);

                                System.out.println(listOfServices.add(s) ? "Added successfully!!!" : "Failed add!!!");
//                                listOfServices.saveData(fileName);
                                listOfServices.saveBinaryFile("data.dat");
                                break;
                            case 2:
                                listOfServices.displayAll();
                                break;
                            case 3:
                                int updateId;
                                System.out.print("Enter ID to update: ");
                                updateId = sc.nextInt();
                                boolean resultUpdate = listOfServices.updateService(updateId);
                                if (resultUpdate == true) {
                                    System.out.println("Updated!!!");
//                                    listOfServices.saveData(fileName);
                                    listOfServices.saveBinaryFile("data.dat");
                                } else {
                                    System.out.println("Failed!!!");
                                }
                                break;
                            case 4:
                                int deleteServiceId;
                                System.out.print("Enter ID to delete: ");
                                deleteServiceId = sc.nextInt();
                                boolean resultDelete = listOfServices.deleteService(deleteServiceId);

                                if (resultDelete) {
                                    System.out.println("Deleted successfully!");
                                    listOfServices.saveData(fileName);
                                } else {
                                    System.out.println("Deleted failed!1");
                                }
                                break;
                            case 5:
                                System.out.println("1. Search by name");
                                System.out.println("2. Search by id");
                                System.out.print("Enter 1 or 2: ");
                                int choice3 = sc.nextInt();

                                switch (choice3) {
                                    case 1:
                                        sc.nextLine();
                                        String searchName = null;
                                        System.out.println("Enter name to finds: ");
                                        searchName = sc.nextLine();

                                        ArrayList<Service> resultSearchByName = listOfServices.searchByName(searchName);

                                        if (resultSearchByName.isEmpty()) {
                                            System.out.println("Not found!!!");
                                        } else {
                                            System.out.println("List of services that you search: ");
                                            ((ServiceList) resultSearchByName).displayAll();
                                        }
                                        break;
                                    case 2:
                                        int findId;
                                        System.out.print("Enter ID:");
                                        findId = sc.nextInt();

                                        Service resultFindById = listOfServices.findServiceById(findId);
                                        if (resultFindById == null) {
                                            System.out.println("Not found");
                                        } else {
                                            System.out.println("The service you found: ");
                                            System.out.println(resultFindById);
                                        }
                                        break;
                                }
                                break;
                        }
                    } while (choice2 <= 4);
                    break;
                case 2:
                    int choiceCusAndOrd;

                    do {
                        System.out.println("1. Create new customer");
                        System.out.println("2. Display customers");
                        System.out.println("3. Search customer by id");
                        System.out.print("Enter choice: ");
                        choiceCusAndOrd = sc.nextInt();
                        switch (choiceCusAndOrd) {
                            case 1:
                                Customer customer = new Customer();
                                String continueAdd = "y";
                                System.out.println("Add information of customer's pet:");
                                do {
                                    System.out.print("Enter pet ID: ");
                                    int petId = sc.nextInt();
                                    sc.nextLine();
                                    System.out.print("Enter pet name: ");
                                    String petName = sc.nextLine();

                                    Pet pet = new Pet(petId, petName);
                                    System.out.println(customer.addPet(pet) ? "Added successfully!" : "Added failed!");

                                    System.out.print("Do you want to add others pet? (y/n): ");
                                    continueAdd = sc.nextLine();
                                } while (continueAdd.equalsIgnoreCase("y"));

                                System.out.println("Process creating order:");
                                String answer = "y";
                                do {
                                    System.out.println("Make order: ");
                                    Order order = new Order();
                                    continueAdd = "y";

                                    do {
                                        System.out.println("Choose your pet within your pet list: ");
                                        customer.displayPetList();

                                        System.out.print("Enter pet id to order: ");
                                        int petIdOrder = sc.nextInt();
                                        Pet pet = customer.findPetById(petIdOrder);
                                        System.out.println("List of services of system: ");
                                        listOfServices.displayAll();
                                        System.out.print("Enter service ID to order: ");
                                        int idService = sc.nextInt();
                                        sc.nextLine();
                                        Service service_order = listOfServices.findServiceById(idService);

                                        if (pet != null && service_order != null) {
                                            OrderDetail detail = new OrderDetail(pet, service_order);
                                            order.createDetail(detail);
                                            System.out.println("Added detail successfully!");
                                        } else {
                                            System.out.println("Service or Pet not found!");
                                        }

                                        System.out.print("Add another detail: ");
                                        continueAdd = sc.nextLine();
                                    } while (continueAdd.equalsIgnoreCase("y"));
                                    System.out.println(customer.addOrder(order) ? "Add order successfully!" : "Failed add!");

                                    System.out.print("Add others: ");
                                    answer = sc.nextLine();
                                } while (answer.equalsIgnoreCase("y"));
                                cusSet.add(customer);
                                customer.exportInfoCustomer();
                                break;
                            case 2:
                                System.out.println("Tệp khách hàng của hệ thống: ");
                                cusSet.displayAll();
                                break;
                            case 3:
                                System.out.print("Enter customer ID to find: ");
                                long cus_Id = sc.nextLong();
                                Customer cus_find_id = cusSet.findCustomerById(cus_Id);
                                if (cus_find_id != null) {
                                    System.out.println("Info customer you find: ");
                                    cus_find_id.exportInfoCustomer();
                                } else {
                                    System.out.println("Not found");
                                }
                                break;
                        }
                    } while (choiceCusAndOrd <= 3);
                    break;
                case 3:
                    int reportChoice = 0;
                    while (reportChoice <= 6) {
                        System.out.println("1. Hiển thị khách của hệ thống");
                        System.out.println("2. Hiển thị số khách hàng có đơn hàng nhiều nhất");
                        System.out.println("3. Hiển thị tất cả đơn hàng của các khách hàng đã đạt trong năm");
                        System.out.println("4. Service được sử dụng nhiều nhất");
                        System.out.println("5. Services chưa được sử dụng");
                        System.out.println("6. Hiển thị doanh thu của hệ thống theo từng quý");
                        System.out.print("Enter choice: ");
                        reportChoice = sc.nextInt();
                        sc.nextLine();
                        ServiceList reportService = cusSet.reportQuantityOfService(listOfServices);

                        switch (reportChoice) {
                            case 1:
                                cusSet.displayAllDesc();
                                break;
                            case 2:
                                ArrayList<Customer> cusWithMostOrders = cusSet.getCustomersWithTheMostOrders();
                                System.out.println("Customer have the most orders");
                                for (Customer cusWithMostOrder : cusWithMostOrders) {
                                    System.out.println("----------------------------------------------------");
                                    cusWithMostOrder.exportInfoCustomer();
                                    System.out.println("----------------------------------------------------");
                                }
                                break;
                            case 3:
                                System.out.print("Enter the year: ");
                                String year = sc.nextLine();
                                ArrayList<Order> ordersInYear = cusSet.getAllOrdersInYear(year);
                                System.out.println("All orders in " + year + ":");
                                if (ordersInYear.isEmpty()) {
                                    System.out.println("No order in " + year);
                                } else {
                                    for (Order order : ordersInYear) {
                                        order.exportOutput();
                                    }
                                }
                                break;
                            case 4:
                                ServiceList listAfterReport = cusSet.reportQuantityOfService(listOfServices);
                                listAfterReport.displayAll();
                                ArrayList<Service> servicesMostUsed = cusSet.getMostUsedSevices(reportService);
                                System.out.println("The most used service: ");
                                for (Service service : servicesMostUsed) {
                                    System.out.println(service);
                                }
                                break;
                            case 5:
                                ArrayList<Service> servicesNotUsed = cusSet.getNotUsedServices(reportService);
                                System.out.println("The not used service: ");
                                if (servicesNotUsed.isEmpty()) {
                                    System.out.println("There is no sevice that have not been used.");
                                } else {
                                    for (Service service : servicesNotUsed) {
                                        System.out.println(service);
                                    }
                                }
                                break;
                            case 6:
                                System.out.print("Enter year: ");
                                String yearRevenue = sc.nextLine();

                                if (cusSet.getAllOrdersInYear(yearRevenue).isEmpty()) {
                                    System.out.println("This year did not have any order");
                                } else {
                                    System.out.println("The revenue of the first quarter: " + cusSet.displayTotalRevenueByQuarter(1, yearRevenue) + "$");
                                    System.out.println("The revenue of the second quarter: " + cusSet.displayTotalRevenueByQuarter(2, yearRevenue) + "$");
                                    System.out.println("The revenue of the third quarter: " + cusSet.displayTotalRevenueByQuarter(3, yearRevenue) + "$");
                                    System.out.println("The revenue of the fourth quarter: " + cusSet.displayTotalRevenueByQuarter(4, yearRevenue) + "$");
                                }
                                break;
                        }
                    }
                    break;
            }
        } while (choice <= 3);
    }
}
