
import java.util.ArrayList;
import java.util.List;
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
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProcessStudent p = new ProcessStudent();
        List<Student> listOfStudent = new ArrayList<>();
        int choice = 0;

        while (choice <= 3) {
            System.out.print("Enter the quantity of student that you want to add: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            for (int i = 1; i <= quantity; i++) {
                System.out.print("Enter ID: ");
                String id = sc.nextLine();
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                System.out.print("Enter GPA: ");
                double gpa = sc.nextDouble();
                sc.nextLine();

                Student student = new Student(id, name, gpa);

                if (listOfStudent.add(student)) System.out.println("Add success!");
                else System.out.println("Add fail!");
            }

            System.out.println("Before: ");
            System.out.print("[");
            for (Student student : listOfStudent) {
                System.out.print(String.format("(" + student.getId() + ", " + student.getName() + ", " + student.getGpa() + ");"));
            }
            System.out.print("]\n");

            System.out.println("1. Test sortStudent()");
            System.out.println("2. Test find_by_partial_name()");
            System.out.println("3. Test find_higher_gpa()");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("[");
                    p.sortStudent(listOfStudent);
                    System.out.print("]\n");
                    break;
                case 2:
                    System.out.print("Enter the name you want to find: ");
                    String partialName = sc.nextLine();
                    List<Student> listByPartialName = p.find_by_partial_name(listOfStudent, partialName);
                    outputListStudentByFormat(listByPartialName);
                    break;
                case 3:
                    System.out.print("Enter GPA: ");
                    double floorGPA = sc.nextDouble();
                    List<Student> listByMaxGPA = p.find_higher_gpa(listOfStudent, floorGPA);
                    outputListStudentByFormat(listByMaxGPA);
                    break;
            }
        }
    }

    public static void outputListStudentByFormat(List<Student> li) {
        for (Student student : li) {
            System.out.println(String.format("(" + student.getId() + ", " + student.getName() + ", " + student.getGpa() + ") "));
        }
    }
}
