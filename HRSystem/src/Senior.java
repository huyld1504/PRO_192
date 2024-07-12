/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Senior extends Dev implements ICode, ITimeTracking{
    private int exp;

    public Senior() {
        super();
        this.exp = 0;
    }

    public Senior(int exp) {
        this.exp = exp;
    }

    public Senior(int exp, String programLanguage, String id, String password, String name, double salary) {
        super(programLanguage, id, password, name, salary);
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Senior{" + "exp=" + exp + '}';
    }
    
    @Override
    public double getIncome() {
        if (exp <= 10) return getSalary() + this.exp * 0.1 * getSalary();
        else return getSalary() + this.exp * 0.2 * getSalary();
    }

    @Override
    public void doTask() {
        System.out.println("Senior is coding!");
    }

    @Override
    public void pull() {
        System.out.println("Senior is pulling code to git!");
    }

    @Override
    public void push() {
        System.out.println("Senior is pushing code to git!");
    }

    @Override
    public void sendRequest() {
        System.out.println("2 days/ " + ITimeTracking.unit);
    }
    
}
