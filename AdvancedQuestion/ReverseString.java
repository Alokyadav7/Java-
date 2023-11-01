package AdvancedQuestion;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string;
        System.out.println("Enter the String you want the reverse of:-");
        string = sc.nextLine();
        int len=string.length();
        String rev = " ";
        for (int i=len-1; i>=0; i--) {
            rev=rev+string.charAt(i);
        }
        System.out.println(rev);
    }
}
