/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Student implements Comparable<Student> {

    private String id, name;
    private double gpa;

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public String getId() {
        return id;
    }

    @Override
    public int compareTo(Student o) {
        if (this.name.compareTo(o.getName()) > 0) {
            return 1;
        } else if (this.name.compareTo(o.getName()) < 0) {
            return -1;
        } else {
            if (this.gpa > o.getGpa()) {
                return 1;
            } else if (this.gpa < o.getGpa()) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
