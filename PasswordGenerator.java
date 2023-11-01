//import java.util.*;
//public class PasswordGenerator {
  //  public static void main(String[] args) {
    //    try {
      //      int length = 10;
        /*    System.out.println(geek_Password(length));
        } catch (Exception exception) {
        }
    }
    static  char [] geek_Password( int len) {
        System.out.println("Generating password using random");
        System.out.println("Your new password is :-");
        String capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String number = "0123456789";
        String symbols = "*!@#$%_+-*()^";
        String values =
                capital_chars + Small_chars + number + symbols;
        Random pass_method = new Random();
        char [] password = new char[len];
        for (int i = 0; i<=len; i++) {
            password[i] = values.charAt
                    (pass_method.nextInt(values.length()));
        }
        return password;
    }
}*/

import java.security.SecureRandom;

public class PasswordGenerator {
    private static final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String CHAR_UPPER = CHAR_LOWER.toUpperCase();
    private static final String NUMBER = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*()_+-=[]{}|;':,./<>?";
    private static final String ALL_CHARS = CHAR_LOWER + CHAR_UPPER + NUMBER + SPECIAL_CHARS;
    private static SecureRandom random = new SecureRandom();

    public static String generatePassword(int length) {
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(ALL_CHARS.length());
            password.append(ALL_CHARS.charAt(randomIndex));
        }

        return password.toString();
    }

    public static void main(String[] args) {
        int passwordLength = 10; // Specify the desired length of the password
        String generatedPassword = generatePassword(passwordLength);
        System.out.println("Generating password using random");
        System.out.println("Your New  Password is:- " + generatedPassword);
    }
}
