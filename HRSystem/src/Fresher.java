/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Fresher extends Dev implements ICode{
    private boolean isFullStack;

    public Fresher() {
        super();
        this.isFullStack = true;
    }

    public Fresher(String programLanguage, String id, String password, String name, double salary) {
        super(programLanguage, id, password, name, salary);
        this.isFullStack = true;
    }

    @Override
    public String toString() {
        return "Fresher{" + "isFullStack=" + isFullStack + '}';
    }
    
    @Override
    public double getIncome() {
        if (isFullStack) return getSalary() * 1.1;
        else return getSalary();
    }

    @Override
    public void doTask() {
        System.out.println("Fresher is coding!");
    }

    @Override
    public void pull() {
        System.out.println("Fresher is pulling code to git");
    }

    @Override
    public void push() {
        System.out.println("Fresher is pushing code to git");
    }

}
