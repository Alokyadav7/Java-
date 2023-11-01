import java.util.Arrays;
import java.util.Scanner;

public  class arr {
    public static void main(String[] args) {
        int a [] = {10,11,9};
        int b [] = {10,11,90};
        boolean Fun = Arrays.equals(a,b);

        if (Fun==true) {
            System.out.println("both a and b are same");
        }
        else {
            System.out.println("both a and b are not same");
        }
    }
}