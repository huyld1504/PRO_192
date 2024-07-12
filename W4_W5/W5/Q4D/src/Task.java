
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
public interface Task {
    public void sortByOwner();
    public List<Motorbike> filterByBrand(String prefix);
    public int countByDistrictCode(String districtCode);
}
