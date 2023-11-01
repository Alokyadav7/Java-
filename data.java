import java.util.Scanner;

public class data {
    public static void main(String[] args) {
       /*
       int a =10;
       int b=10;
       */
        Scanner alok = new Scanner(System.in);
        System.out.println("Enter the value of a:-");
        int a = alok.nextInt();
        System.out.println("Enter the value of b:-");
        int b = alok.nextInt();
        int sum = a + b;
        System.out.println("The sum of a and b is:-" + sum);
    }
}