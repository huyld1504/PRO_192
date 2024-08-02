/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

import Order.Order;
import Order.OrderDetail;
import Service.Service;
import Service.ServiceList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Asus
 */
public class CustomerSet extends TreeSet<Customer> {

    public void displayAll() {
        for (Customer c : this) {
            System.out.println("----------------------------------");
            c.exportInfoCustomer();
            System.out.println("----------------------------------");
        }
    }

    public void displayAllDesc() {
        Iterator<Customer> it = descendingIterator();

        while (it.hasNext()) {
            Customer c = it.next();
            System.out.println("----------------------------------");
            c.exportInfoCustomer();
            System.out.println("----------------------------------");
        }
    }

    public Customer findCustomerById(long id) {
        for (Customer c : this) {
            if (c.getId() == id) {
                return c;
            }
        }

        return null;
    }

    public ArrayList<Customer> getCustomersWithTheMostOrders() {
        ArrayList<Customer> result = new ArrayList<>();
        int max = this.first().getOrderList().size();

        for (Customer customer : this) {
            if (customer.getOrderList().size() > max) {
                max = customer.getOrderList().size();
            }
        }

        for (Customer customer : this) {
            if (customer.getOrderList().size() == max) {
                result.add(customer);
            }
        }

        return result;
    }

    public ArrayList<Order> getAllOrdersInYear(String year) {
        ArrayList<Order> result = new ArrayList<>();
        for (Customer customer : this) {
            for (Order order : customer.getOrderList()) {
                String[] orderDateSplit = order.getOrderDate().toString().split("\\s+");
                String orderYear = orderDateSplit[orderDateSplit.length - 1];
                if (orderYear.equals(year)) {
                    result.add(order);
                }
            }
        }
        return result;
    }

    private ArrayList<Service> getAllServicesInOrders() {
        ArrayList<Service> services = new ArrayList<>();

        for (Customer customer : this) {
            for (Order order : customer.getOrderList()) {
                for (OrderDetail orderDetail : order.getDetailList()) {
                    Service service = orderDetail.getService();
                    services.add(service);
                }
            }
        }
        return services;
    }

    public ServiceList reportQuantityOfService(ServiceList listOfServices) {
        ArrayList<Service> servicesFromOrders = this.getAllServicesInOrders();

        for (Service service : listOfServices) {
            int count = 0;
            for (Service serviceFromOrders : servicesFromOrders) {
                if (service.getId() == serviceFromOrders.getId()) {
                    service.setQuantity(++count);
                }
            }
        }

        return listOfServices;
    }

    public ArrayList<Service> getMostUsedSevices(ServiceList listOfServices) {
        ArrayList<Service> result = new ArrayList<>();
        int max = listOfServices.get(0).getQuantity();

        for (Service service : listOfServices) {
            if (service.getQuantity() > max) {
                max = service.getQuantity();
            }
        }

        for (Service service : listOfServices) {
            if (service.getQuantity() == max) {
                result.add(service);
            }
        }

        return result;
    }

    public ArrayList<Service> getNotUsedServices(ServiceList listOfServices) {
        ArrayList<Service> result = new ArrayList<>();

        for (Service service : listOfServices) {
            if (service.getQuantity() == 0) {
                result.add(service);
            }
        }

        return result;
    }

    public int displayTotalRevenueByQuarter(int quarter, String year) {
        ArrayList<Order> orderInYear = this.getAllOrdersInYear(year);
        int totalRevenue = 0;

        for (Order order : orderInYear) {
            String monthOrder = order.getOrderDate().toString().split("\\s+")[1];

            switch (quarter) {
                case 1:
                    if (monthOrder.equals("Jan") || monthOrder.equals("Feb") || monthOrder.equals("Mar")) {
                        for (OrderDetail orderDetail : order.getDetailList()) {
                            totalRevenue += orderDetail.getService().getPrice();
                        }
                    }
                    break;
                case 2:
                    if (monthOrder.equals("Apr") || monthOrder.equals("May") || monthOrder.equals("Jun")) {
                        for (OrderDetail orderDetail : order.getDetailList()) {
                            totalRevenue += orderDetail.getService().getPrice();
                        }
                    }
                    break;
                case 3:
                    if (monthOrder.equals("Jul") || monthOrder.equals("Aug") || monthOrder.equals("Sep")) {
                        for (OrderDetail orderDetail : order.getDetailList()) {
                            totalRevenue += orderDetail.getService().getPrice();
                        }
                    }
                    break;
                case 4:
                    if (monthOrder.equals("Oct") || monthOrder.equals("Nov") || monthOrder.equals("Dec")) {
                        for (OrderDetail orderDetail : order.getDetailList()) {
                            totalRevenue += orderDetail.getService().getPrice();
                        }
                    }
                    break;
            }
        }

        return totalRevenue;
    }
}
