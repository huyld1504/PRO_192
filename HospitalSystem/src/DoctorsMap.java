
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class DoctorsMap extends HashMap<Integer, Doctor>{   
    
    public void displayAll () {
        Collection<Doctor> doctors = values();
        
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }
    }
    
    public void displayAll2 () {
        Set<Integer> doctors_id = keySet();
        
        for (Integer id : doctors_id) {
            Doctor d = get(id);
            System.out.println(d);
        }
    }
}