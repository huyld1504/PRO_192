
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
public class MyTShirt implements ITShirt {

    @Override
    public int f1(List<TShirt> t) {
        int count = 0;
        for (TShirt tShirt : t) {
            if (Character.isDigit(tShirt.getStyle().charAt(0)))
                count++;
        }
        
        return count;
    }

    @Override
    public void f2(List<TShirt> t) {
        for (TShirt tShirt : t) {
            if (tShirt.getSize() > 3) {
                System.out.print(tShirt);
            }
        }
        System.out.println("\n");
    }

    @Override
    public void f3(List<TShirt> t) {
        Collections.sort(t);
        for (TShirt tShirt : t) {
            System.out.println(tShirt);
        }
    }

}
