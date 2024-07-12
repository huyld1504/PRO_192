/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Employee {
    private int id, salary;
    private String firstName, lastName;

    public Employee(int id, int salary, String firstName, String lastName) {
        this.id = id;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Employee() {
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getName() {
        return (this.firstName + " " + this.lastName);
    }
    
    public int getAnnualSalary() {
        return this.salary * 12;
    }
    
    public int raiseSalary(int percent) {
        double raiseSalary = (this.salary * percent) / 100;
        
        int result = this.salary + (int) raiseSalary;
        
        return result;
    }

    @Override
    public String toString() {
        return ("Employee[" + "id=" + this.id + ", name=" + getName() + ", salary=" + this.salary + "]");
    }
    
    
}
