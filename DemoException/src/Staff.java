
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Staff {
    private int salary, id;
    
    public void intput() {
        System.out.print("Enter id: ");
        boolean cont = false;
        while (cont) {
            try {
            id = Library.inputNumber(1, 1000);
            salary = Library.inputNumber(1000, 100000);
            cont = false;
        } catch (Exception ex) {
            System.out.println("ID is invalid");
            cont = true;
        }
        }
    }
}
