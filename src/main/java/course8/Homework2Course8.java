package course8;

import java.util.ArrayList;
import java.util.List;

public class Homework2Course8 {
    public static void main(String[] args) {
        Homework2Course8 password1 = new Homework2Course8();
        Homework2Course8 password2 = new Homework2Course8();
        Homework2Course8 password3 = new Homework2Course8();
        password1.passwordCheck("Abcdef123456");
        password2.passwordCheck("abcd123");
        password3.passwordCheck("abcd34");
    }

    //We verify if the password has at least 12 characters

    public static boolean length(String str){
        if(str.length()<12)
            return false;
        else
            return true;
    }

    //We verify if the password har upper case characters

    public static boolean upperCase(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            if (Character.isUpperCase(aChar)) {
                return true;
            }
        }
        return false;

    }

    //We verify if the password har lower case characters

    public static boolean lowerCase(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            if (Character.isLowerCase(aChar)) {
                return true;
            }
        }
        return false;

    }

    // We verify if the password contains only letters and digits

    public static boolean value(String str) {
       if (str == null || str.length() == 0) {
           return false;
       }
       for(int i = 0; i < str.length(); i++){
           char ch = str.charAt(i);
           int nr = Character.getNumericValue(ch);
           if(nr>=0){
               return true;
           }
       }
       return false;
    }

    // We verify if the password has at least 3 digits

    public static boolean digits(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int digits = 0;
       for(int i = 0; i < str.length(); i++){
           char ch = str.charAt(i);
           if(Character.isDigit(ch)){
               digits++;
           }
           if(digits>=3){
               return true;
           }
       }
       return false;
    }

    //Final method:

    public void passwordCheck(String str){
        List<String> invalidRules = new ArrayList<String>();

        if(!length(str)){
            invalidRules.add("Length must have at least 12 characters");
        }
        if(!upperCase(str)){
            invalidRules.add("UpperCase must have at least 1 characters");
        }
        if(!lowerCase(str)){
            invalidRules.add("LowerCase must have at least 1 characters");
        }
        if(!digits(str)){
            invalidRules.add("Digits must have at least 3 characters");
        }
        if(invalidRules.isEmpty()){
            System.out.println("The password is valid: " + str );
        } else {
            System.out.println("The password is invalid: " + str );
            System.out.println("The following rules are not fulfilled: " + invalidRules );

        }
    }
}




