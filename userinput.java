import java.util.Scanner;
import java.util.StringTokenizer;

public class userinput {
    public static void main(String[] args) {

        System.out.println("Taking the input from the user:");
        Scanner ab = new Scanner(System.in);
        //System.out.println("Enter the first number:");
        //int a = ab.nextInt();
        //System.out.println("Enter the second number");
        //int b = ab.nextInt();
        //int sum=a+b;
        //System.out.println("The sum of these number is:");
        //System.out.println(sum);
        //String str= ab.next(); // IT IS USE TO PRINT ONE WORD OF STRING
        String str = ab.nextLine(); // IT IS USE TO PRINT WHOLE LINE OF STRING.
        System.out.println(str);
    }
}
