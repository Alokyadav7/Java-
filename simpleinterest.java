import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal Amount:-");
        int p = sc.nextInt();
        System.out.println("Enter rate of interest:-");
        int r = sc.nextInt();
        System.out.println("Enter time period:-");
        int t = sc.nextInt();
        int f = p*r*t/100;

        System.out.println("Simple interest is:-" +f);
    }
}
