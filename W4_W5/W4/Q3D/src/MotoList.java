
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
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
public class MotoList extends HashMap<String, Motorbike> {

    public List<Motorbike> toList() {
        List<Motorbike> listOfMotorbike = new ArrayList<>();
        Collection<Motorbike> mapOfMotorbike = values();

        for (Motorbike motorbike : mapOfMotorbike) {
            listOfMotorbike.add(motorbike);
        }

        return listOfMotorbike;
    }

    public void addElement(Motorbike m) {
        put(m.getLiencePlate(), m);
    }

    public void listByDistrict(String districtCode) {
        Set<String> districtCodeSet = keySet();
        
        for (String code : districtCodeSet) {
            if (code.split("")[2].equalsIgnoreCase(districtCode)){
                System.out.println(get(code));
            }
        }
    }
    
    public long totalValue() {
        long totalValue = 0;
        
        for (Motorbike motorbike : toList()) {
            totalValue += motorbike.getValue();
        }
        
        return totalValue;
    }
    
    public void showAll() {
        for (Motorbike m : toList()) {
            System.out.println(String.format("%s - %s - %s", m.getLiencePlate(), m.getOwner(), m.getValue()));
        }
    }
}
