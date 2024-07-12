
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class BusMotor implements Task{
    private List<Motorbike> items;

    public BusMotor() {
        items = new ArrayList<>();
    }
    
    public void add(Motorbike x) {
        ((ArrayList)this.items).add(x);
    }
    
    public List<Motorbike> getList() {
        return this.items;
    }

    @Override
    public void sortByOwner() {
        Collections.sort(this.items);
        
        for (Motorbike motorbike : items) {
            System.out.println(motorbike);
        }
    }

    @Override
    public List<Motorbike> filterByBrand(String prefix) {
        List<Motorbike> result = new ArrayList<>();
        for (Motorbike motorbike : this.items) {
            if (motorbike.getBrand().toLowerCase().contains(prefix.toLowerCase())) result.add(motorbike);
        }
        
        return result;
    }

    @Override
    public int countByDistrictCode(String districtCode) {
        int count = 0;
        for (Motorbike motorbike : this.items) {
            if (motorbike.getLiencePlate().split("")[2].equalsIgnoreCase(districtCode)) count++;
        }
        return count;
    }
}
