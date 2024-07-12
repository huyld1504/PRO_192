import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> studentList = new ArrayList<>();
        
        System.out.println("Enter the number of student: ");
        int numberOfStudent = sc.nextInt();
        sc.nextLine();
        
        System.out.println("The student list before uppercasing: ");
        for (int i = 0; i < numberOfStudent; i++) {
            System.out.println("The student no." + (i + 1) + ": ");
            String studentName = sc.nextLine();
            studentList.add(studentName);
        }
        
        for (String name : studentList) {
            int i = 1;
            String capitalizeName = capitalizeEachLetter(name);
            System.out.println("Student no " + (i) + " is: " + capitalizeName);
            i++;
        }
    }
    
    public static String capitalizeEachLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        String[] words = str.split("\\s+");
        StringBuilder capitalizeString = new StringBuilder();
        
        for (String word : words) {
            if (word.length() > 0) {
                capitalizeString.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }
        
        return capitalizeString.toString().trim();
    }
}
