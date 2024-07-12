/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public abstract class Dev extends Staff {
    private String programLanguage;

    public Dev() {
        super();
        this.programLanguage = null;
    }

    public Dev(String programLanguage, String id, String password, String name, double salary) {
        super(id, password, name, salary);
        this.programLanguage = programLanguage;
    }
    
    
    
    
}
