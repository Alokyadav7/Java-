import java.util.*;

public class p {
    public static void main(String[] args) {
        //int num = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an number:-");
        int num = sc.nextInt();
        int i = 2;
        boolean flag = false;

        while (i<=num/2)
        {
            if (num%i==0)
            {
                flag = true;
                break;
            }
            i++;
        }
        if (!flag) {
            System.out.println("It is an prime number");
        }
        else
            System.out.println("it is not an prime number");
    }
}