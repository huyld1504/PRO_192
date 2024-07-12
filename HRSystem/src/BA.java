/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class BA extends Staff implements ITimeTracking{
    private String field;

    public BA(String field) {
        this.field = field;
    }

    public BA(String field, String id, String password, String name, double salary) {
        super(id, password, name, salary);
        this.field = field;
    }

    public BA() {
        super();
        this.field = "health";
    }

    @Override
    public double getIncome() {
        return getSalary() + 100;
    }

    @Override
    public void doTask() {
        System.out.println("BA is doing task at the moment!");
    }

    @Override
    public void sendRequest() {
        System.out.println("3 days/ " + ITimeTracking.unit);
    }
    
}
