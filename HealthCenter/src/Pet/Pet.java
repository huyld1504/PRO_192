/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pet;

/**
 *
 * @author Asus
 */
public class Pet {
    private int id;
    private String name;

    public Pet(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Pet() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" + "id=" + id + ", name=" + name + '}';
    }
    
    
}
