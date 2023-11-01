import java.util.Scanner;

public class fib {
    public static void main(String[] args) {
        System.out.println("Enter the series you want:-");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        fib(num);
        sc.close();
    }
    static void fib (int n) {
        int x=1, y=0, z=0, count=1;
        System.out.println(z+" ");
        while (count<=n) {
            z=x+y;
            x=y;
            y=z;
            count++;
        }
    }
}