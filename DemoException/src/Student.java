
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Asus
 */
public class Student {

    private int id;
    private String name;

    public void input() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Etner id ");
            this.id = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Error");
//            throw e;
        }
    }

    public void readData(String file) {
        FileReader f = null;
        BufferedReader br = null;
        try {
            f = new FileReader(file);
            br = new BufferedReader(f);

            while (br.ready()) {
                System.out.println(br.readLine());
            }

        } catch (Exception e) {
            System.out.println("Error file");
        } finally {
            try {
                f.close();
            } catch (Exception e) {
                System.out.println("Error file");
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + '}';
    }
}
