/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public abstract class Staff {
    private String id, password, name;
    private double salary;

    public Staff() {
        this.id = null;
        this.name = null;
        this.password = null;
        this.salary = 0;
    }

    public Staff(String id, String password, String name, double salary) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public boolean login (String id, String password) {
        return (this.id.equals(id) && this.password.equals(password));
    }
    
    public double getTax () {
        return 0.05 * this.salary;
    }

    @Override
    public String toString() {
        return "Staff{" + "id=" + id + ", password=" + password + ", name=" + name + ", salary=" + salary + '}';
    }
    
    public abstract double getIncome();
    public abstract void doTask();
}
