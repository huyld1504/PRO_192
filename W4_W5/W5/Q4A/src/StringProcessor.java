/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class StringProcessor {
    public static boolean match_student_id(String studentID) {
        return studentID.matches("^(SE|Se|sE|se|he|qe|HE|hE|He|QE|Qe|qE)\\d{4,6}$");
    }
    
    public static StringBuilder formatCamel(String string) {
        String[] splitString = string.trim().split("_");
        StringBuilder result = new StringBuilder();
        result.append(splitString[0]);
        
        for (int i = 1; i < splitString.length; i++) {
            result.append(splitString[i].substring(0, 1).toUpperCase()).append(splitString[i].substring(1).toLowerCase());
        }
        
        return result;
    }
}
