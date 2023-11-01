import java.util.Scanner;

public class fibonocci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the series you want:-");
        int num = sc.nextInt();
        fibonociidisplayseries(num);
        sc.close();
    }
    static void fibonociidisplayseries (int n) {
        int x=1, y=0, z=0, count=1;
        while (count<=n) {
            System.out.print(z+ "  ");
            z=x+y;
            x=y;
            y=z;
            count++;
        }
    }
}

