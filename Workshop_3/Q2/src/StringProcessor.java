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
    
    public boolean match_student_id (String string) {
        return string.matches("^(se|sE|Se|SE|he|hE|He|HE|Qe|qE|QE|qe|)\\d{4,6}$");
    }
    
    public String format_camel (String string) {
        String[] newString = string.split("_");
        StringBuilder camelCase = new StringBuilder(newString[0].toLowerCase());
        
        for (int i = 1; i < newString.length; i++) {
            camelCase.append(newString[i].substring(0, 1).toUpperCase());
            camelCase.append(newString[i].substring(1).toLowerCase());
        }
        
        return ("[" + camelCase.toString() + "]");
    }
}
