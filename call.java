import java.util.Scanner;

public class call {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:-");
        int num1 = sc.nextInt();

        System.out.println("Enter second number:-");
        int num2 = sc.nextInt();

        System.out.println("Enter your choice ['+,-,/,*,%']");
        char operator = sc.next().charAt(0);

        if (operator=='+' || operator=='-' || operator=='/' || operator=='*' || operator=='%')
        {
            int res = calculate(num1,num2,operator);
            System.out.println(num1+ " " +operator+ " " +num2 + " = " +res);
        }
        else {
            System.out.println("Invalid option");
        }
        sc.close();
    }

    static int calculate (int x, int y, char operator) {
        int res = 0;
        switch (operator)
        {
            case '+':
                res=x+y;
                break;

            case '-':
                res=x-y;
                break;

            case '*':
                res=x*y;
                break;

            case '/' :
                res=x/y;
                break;
        }
        return res;
    }
}
