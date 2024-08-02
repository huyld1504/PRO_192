package Service;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ServiceList extends ArrayList<Service> implements Serializable{
    
    public void loadData(String fileName) {
        FileReader f = null;
        BufferedReader bfr = null;
        try {
            File check = new File(fileName);
            if(check.exists()) {
                f = new FileReader(fileName);
                bfr = new BufferedReader(f);
                
                while (bfr.ready()) {
                    String s = bfr.readLine();
                    String[] arr = s.split(",");
                    
                    if (arr.length == 3) {
                        int id = Integer.parseInt(arr[0].trim());
                        String name = arr[1].trim();
                        int price = Integer.parseInt(arr[2].trim());
                        
                        Service service = new Service(id, price, name);
                        add(service);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error file");
        } finally {
            try {
                if(f != null) f.close();
                if(bfr != null) bfr.close();
            } catch (Exception e) {
                System.out.println("Error file");
            }
        }
    }
    
    public void saveData(String fileName) {
        PrintWriter w = null;
        
        try {
            w = new PrintWriter(fileName);
            for (Service service : this) {
                String tmp = service.getId()+", "+ service.getName()+","+ service.getPrice() + "\n";
                w.print(tmp);
                w.flush();
            }
            
        } catch (Exception e) {
            System.out.println("Error file");
        } finally {
            try {
                if(w != null) w.close();
            } catch (Exception e) {
                System.out.println("Error file");
            }
        }
    }

    public void displayAll() {
        
        Iterator<Service> it = iterator();
        while (it.hasNext()) {
            Service s = it.next();
            System.out.println(s);
        }     
    }
    
    public ArrayList<Service> searchByName (String name) {
        ArrayList<Service> resultServices = new ServiceList();
        
        for (Service s : this) {
            if (s.getName().contains(name)) {
                resultServices.add(s);
            }
        }
        
        return resultServices;
    }
    
    public Service findServiceById (int id) {
        Service resultServices = null;
        
        for (Service s : this) {
            if (s.getId() == id) {
                resultServices = s;
                break;
            }
        }
        
        return resultServices;
    }
    
    public boolean updateService (int id) {
        Service resultService = findServiceById(id);
        
        if (resultService != null) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter new service's name: ");
            resultService.setName(sc.nextLine());
            System.out.print("Enter new service's price: ");
            resultService.setPrice(sc.nextInt());
            return true;
        } else {
            System.out.println("Service not found!");
            return false;
        }
    }
    
    public boolean deleteService (int id) {
        Service resultService = findServiceById(id);
        
        if (resultService != null) {
            remove(resultService);
            return true;
        } else {
            System.out.println("Service not found !");
            return false;
        }
        
    }
    
    public void sortNotUsed () {
        Collections.sort(this);
    }
    
    public void sortPopular () {
        Collections.sort(this, Service.tmp);
    }
    
    public  void loadBinaryFile(String fileName) {
        FileInputStream f = null;
        ObjectInputStream oi = null;
        
        try {
            File check = new File(fileName);
            if(check.exists()) {
                f = new FileInputStream(fileName);
                oi = new ObjectInputStream(f);
                addAll((ArrayList<Service>) oi.readObject());
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                if (f != null) f.close();
                if (oi != null) oi.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    
    public void saveBinaryFile(String fileName) {
        FileOutputStream f = null;
        ObjectOutputStream of = null;
        try {
            f = new FileOutputStream(fileName);
            of = new ObjectOutputStream(f);
            of.writeObject(this);
        } catch (Exception e) {
            System.out.println("Error file");
        } finally {
            try {
                if (f != null) f.close();
                if (of != null) of.close();
            } catch(Exception e) {
                System.out.println("Error file");
            }
        }
    }
    
}
