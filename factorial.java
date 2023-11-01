import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Factorial:-");
        int num = sc.nextInt();

        factorial obj = new factorial();
        int fact = obj.factorial(num);
        System.out.println("Factorial of "+num+" = "+fact);
    }
    int factorial (int n) {
        int fact = 1;
        for (int j=2; j<=n; j++) {
            fact *= j;
        }
        return fact;
    }
}
