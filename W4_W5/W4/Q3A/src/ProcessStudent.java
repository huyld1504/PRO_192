
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
public class ProcessStudent {

    public void sortStudent(List<Student> l) {
        Collections.sort(l);

        for (Student student : l) {
            System.out.print(String.format("(" + student.getId() + ", " + student.getName() + ", " + student.getGpa() + ");"));
        }
    }
    
    public List<Student> find_by_partial_name (List<Student> li, String letter) {
        List<Student> listByPartialName = new ArrayList<>(); 
        
        for (Student student : li) {           
            if (student.getName().equals(letter)) listByPartialName.add(student);
        }
        
        return listByPartialName;
    }
    
    public List<Student> find_higher_gpa (List<Student> li, double gpa) {
        List<Student> listByHigherGPA = new ArrayList<>();
        
        for (Student student : li) {
            if (student.getGpa() > gpa || student.getGpa() == gpa) listByHigherGPA.add(student);
        }      
        return listByHigherGPA;
    }
}
